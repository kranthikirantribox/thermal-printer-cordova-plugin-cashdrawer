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
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import java.util.logging.Handler;

public class CashDrawerController {

  private static final String ACTION_USB_PERMISSION = "com.example.yourapp.USB_PERMISSION";
  private Context context;

  public CashDrawerController(Context context) {
    this.context = context;
  }

  public void openCashDrawer() {
    UsbManager usbManager = (UsbManager) context.getSystemService(Context.USB_SERVICE);

    UsbDevice usbDevice = findYourPrinterDevice(usbManager);

    if (usbDevice != null) {
      PendingIntent permissionIntent = PendingIntent.getBroadcast(
          context,
          0,
          new Intent(ACTION_USB_PERMISSION),
          PendingIntent.FLAG_IMMUTABLE);

      // Request permission to access the USB device
      usbManager.requestPermission(usbDevice, permissionIntent);

      if (usbManager.hasPermission(usbDevice)) {
        UsbDeviceConnection connection = usbManager.openDevice(usbDevice);
        if (connection != null) {
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
            // Define an array of commands to open the cash drawer
            byte[][] cashDrawerCommands = {
                generateCashDrawerCommand1(),
                generateCashDrawerCommand2(),
                generateCashDrawerCommand3(),
                generateCashDrawerCommand4(),
                generateCashDrawerCommand5()
                // Add more commands as needed
            };

            for (byte[] commandBytes : cashDrawerCommands) {
              int bytesSent = connection.bulkTransfer(outEndpoint, commandBytes, commandBytes.length, 5000);

              if (bytesSent >= 0) {
                Log.d("CashDrawerController", "Cash drawer command sent successfully");
              } else {
                Log.e("CashDrawerController", "Failed to send cash drawer command");
              }
            }
          }

          connection.releaseInterface(usbInterface);
          connection.close();
        }
      }
    }
  }

  private UsbDevice findYourPrinterDevice(UsbManager usbManager) {
    // Implement a method to identify your printer's USB device based on vendor and
    // product IDs
    // You will need to implement this based on your printer's IDs
    // Here's a basic example:
    for (UsbDevice device : usbManager.getDeviceList().values()) {
      // if (device.getVendorId() == YOUR_VENDOR_ID && device.getProductId() ==
      // YOUR_PRODUCT_ID) {
      return device;
      // }
    }
    return null;
  }

  private byte[] generateCashDrawerCommand1() {
    // Implement the command bytes specific to your printer to open the cash drawer
    // This command will vary depending on your printer model
    // Consult your printer's documentation for the correct command
    byte[] commandBytes = { 27, 112, 0, 25, (byte) 250 };
    return commandBytes;
  }

  private byte[] generateCashDrawerCommand2() {
    // Implement the command bytes specific to your printer to open the cash drawer
    // This command will vary depending on your printer model
    // Consult your printer's documentation for the correct command
    byte[] commandBytes = { 0x1B, 0x70, 0x00, 0x19, (byte) 0xFF };
    return commandBytes;
  }

  private byte[] generateCashDrawerCommand3() {
    // Implement the command bytes specific to your printer to open the cash drawer
    // This command will vary depending on your printer model
    // Consult your printer's documentation for the correct command
    byte[] commandBytes = { 16, 20, 0, 0, 0 };
    return commandBytes;
  }

  public byte[] generateCashDrawerCommand4() {
    // Example command to print "Hello, World" to the thermal printer
    // This is a simple text command, and the actual command may vary based on your
    // printer model

    byte[] commandBytes = { 0x10, 0x14, 0x00, 0x00, 0x00 };
    return commandBytes;
  }

  public byte[] generateCashDrawerCommand5() {
    // Example command to print "Hello, World" to the thermal printer
    // This is a simple text command, and the actual command may vary based on your
    // printer model
    String textToPrint = "Hello, World\n";
    return textToPrint.getBytes();
  }

}
