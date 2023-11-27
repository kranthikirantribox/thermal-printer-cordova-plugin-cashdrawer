package de.paystory.thermal_printer;

import android.content.Context;
import android.hardware.usb.UsbConstants;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;

public class SerialCommunication {

  private static final int USB_VENDOR_ID = 1110; // Replace with your USB vendor ID
  private static final int USB_PRODUCT_ID = 2056; // Replace with your USB product ID

  private UsbManager usbManager;
  private UsbDevice usbDevice;
  private UsbDeviceConnection usbConnection;
  private UsbInterface usbInterface;
  private UsbEndpoint usbEndpointIn;
  private UsbEndpoint usbEndpointOut;

  private Handler handler;

  private static final int READ_BUFFER_SIZE = 8192; // Adjust the buffer size based on your requirements

  public SerialCommunication(Context context, Handler handler) {
    this.handler = handler;
    usbManager = (UsbManager) context.getSystemService(Context.USB_SERVICE);
  }

  public void open(Context context) {
    // Find the USB device by vendor and product ID
    usbDevice = findUsbDevice(context);

    if (usbDevice != null) {
      // Open a connection to the USB device
      usbConnection = usbManager.openDevice(usbDevice);

      if (usbConnection != null) {
        // Find the communication interface
        usbInterface = usbDevice.getInterface(0);

        // Claim the interface
        if (usbConnection.claimInterface(usbInterface, true)) {
          // Find the communication endpoints
          for (int i = 0; i < usbInterface.getEndpointCount(); i++) {
            UsbEndpoint endpoint = usbInterface.getEndpoint(i);
            if (endpoint.getType() == UsbConstants.USB_ENDPOINT_XFER_BULK) {
              if (endpoint.getDirection() == UsbConstants.USB_DIR_IN) {
                usbEndpointIn = endpoint;
              } else if (endpoint.getDirection() == UsbConstants.USB_DIR_OUT) {
                usbEndpointOut = endpoint;
              }
            }
          }

          // Start communication threads
          startCommunication(context);
        } else {
          close();
          sendMessageToHandler("Failed to claim interface");
          showToast("Failed to claim interface", context);

        }
      } else {
        sendMessageToHandler("Failed to open USB connection");
        showToast("Failed to open USB connection", context);
      }
    } else {
      sendMessageToHandler("USB device not found");
      showToast("USB device not found", context);
    }
  }
  private void startCommunication(Context context) {
    showToast("Working", context);

    // Example command: 16, 20, 0, 0, 0
    byte[] commandBytes = new byte[]{27, 112, 0, 25, (byte) 250};

    // Example text to send
    String textToSend = "Hello, USB device!";

    try {
      // Write the command to the USB device
      int bytesWrittenCommand = usbConnection.bulkTransfer(usbEndpointOut, commandBytes, commandBytes.length, 5000);

      if (bytesWrittenCommand >= 0) {
        showToast("Command sent successfully", context);
        Log.e("3333333333333333", "Command sent successfully");

        // Convert the text to bytes
        byte[] textBytes = textToSend.getBytes("UTF-8");

        // Write the text to the USB device
        int bytesWrittenText = usbConnection.bulkTransfer(usbEndpointOut, textBytes, textBytes.length, 5000);

        if (bytesWrittenText >= 0) {
          showToast("Text sent successfully", context);
          Log.e("3333333333333333", "Text sent successfully");
        } else {
          showToast("Failed to send text", context);
          Log.e("3333333333333333", "Failed to send text");
        }

        // Read the response (if needed)
        byte[] readBuffer = new byte[READ_BUFFER_SIZE];
        int bytesRead = usbConnection.bulkTransfer(usbEndpointIn, readBuffer, readBuffer.length, 5000);

        if (bytesRead > 0) {
          // Process the received data if needed
          String receivedText = new String(readBuffer, 0, bytesRead, "UTF-8");
          showToast("Received text: " + receivedText, context);
          Log.e("3333333333333333", "Received text: " + receivedText);
        }

      } else {
        showToast("Failed to send command", context);
        Log.e("3333333333333333", "Failed to send command");
      }

    } catch (Exception e) {
      showToast("Error during communication: " + e.getMessage(), context);
      Log.e("3333333333333333", "Error during communication: " + e.getMessage());
    } finally {
      // Close the connection when done
      close();
    }
  }



  public void close() {
    if (usbConnection != null) {
      usbConnection.releaseInterface(usbInterface);
      usbConnection.close();
    }
  }
  private void showToast(String message, Context context) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
  }

  private UsbDevice findUsbDevice(Context context) {
    HashMap<String, UsbDevice> usbDevices = usbManager.getDeviceList();
    for (UsbDevice device : usbDevices.values()) {
      showToast(String.valueOf(device.getVendorId()),context);
      showToast(String.valueOf(device.getProductId()),context);
      if (device.getVendorId() == USB_VENDOR_ID && device.getProductId() == USB_PRODUCT_ID) {
        return device;
      }
    }
    return null;
  }

  private void sendMessageToHandler(String message) {
    Message msg = handler.obtainMessage();
    msg.obj = message;
    Log.e("3333333333333333",message);
    handler.sendMessage(msg);
  }
}
