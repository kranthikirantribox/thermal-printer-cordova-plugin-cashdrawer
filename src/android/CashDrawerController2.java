package de.paystory.thermal_printer;

import android.content.Context;
import android.content.Intent;
import android.app.PendingIntent;
import android.hardware.usb.UsbConstants;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbDeviceConnection;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

public class CashDrawerController2 {

  private static final String ACTION_USB_PERMISSION = "com.example.yourapp.USB_PERMISSION";
  private Context context;

  public CashDrawerController2(Context context) {
    this.context = context;
  }

  public void openCashDrawer() {
    UsbManager usbManager = (UsbManager) context.getSystemService(Context.USB_SERVICE);

    UsbDevice usbDevice = findYourCashDrawerDevice(usbManager);

    if (usbDevice != null) {
      PendingIntent permissionIntent = PendingIntent.getBroadcast(
        context,
        0,
        new Intent(ACTION_USB_PERMISSION),
        PendingIntent.FLAG_IMMUTABLE
      );

      // Request permission to access the USB device
      usbManager.requestPermission(usbDevice, permissionIntent);

      if (usbManager.hasPermission(usbDevice)) {
        UsbDeviceConnection connection = usbManager.openDevice(usbDevice);
        if (connection != null) {
          // Replace this with the correct serial port for your device
          String serialPortName = "/dev/ttyS1";
          SerialPort serialPort = new SerialPort(serialPortName); // Implement the SerialPort class

          // Open the serial connection
          if (serialPort.open()) {
            UsbInterface usbInterface = usbDevice.getInterface(0);
            connection.claimInterface(usbInterface, true);

            UsbEndpoint outEndpoint = null;
            for (int i = 0; i < usbInterface.getEndpointCount(); i++) {
              if (usbInterface.getEndpoint(i).getType() == UsbConstants.USB_ENDPOINT_XFER_BULK) {
                if (usbInterface.getEndpoint(i).getDirection() == UsbConstants.USB_DIR_OUT) {
                  outEndpoint = usbInterface.getEndpoint(i);
                }
              }
            }

            if (outEndpoint != null) {
              // Send the command to open the cash drawer
              byte[] commandBytes = generateCashDrawerCommand();
              int bytesSent = connection.bulkTransfer(outEndpoint, commandBytes, commandBytes.length, 5000);

              if (bytesSent >= 0) {
                Log.d("CashDrawerController", "Cash drawer command sent successfully");
                // ShowToast("Cash drawer command sent successfully");
              } else {
                Log.e("CashDrawerController", "Failed to send cash drawer command");
                // ShowToast("Failed to send cash drawer command");
              }
            }

            connection.releaseInterface(usbInterface);
            connection.close();
            serialPort.close(); // Close the serial port connection
          }
        }
      }
    }
  }

  private UsbDevice findYourCashDrawerDevice(UsbManager usbManager) {
    // Implement a method to identify your cash drawer's USB device based on vendor and product IDs
    // You will need to implement this based on your cash drawer's IDs
    // Here's a basic example:
    for (UsbDevice device : usbManager.getDeviceList().values()) {
      // if (device.getVendorId() == YOUR_VENDOR_ID && device.getProductId() == YOUR_PRODUCT_ID) {
      return device;
      // }
    }
    return null;
  }

  private byte[] generateCashDrawerCommand() {
    // Implement the command bytes specific to your cash drawer to open the cash drawer
    // This command will vary depending on your cash drawer model
    // Consult your cash drawer's documentation for the correct command
    byte[] commandBytes = {16, 20, 0, 0, 0};
    return commandBytes;
  }
}

