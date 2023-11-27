package de.paystory.thermal_printer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SerialPort {
  private File device;
  private InputStream inputStream;
  private OutputStream outputStream;

  public SerialPort(String devicePath) {
    this.device = new File(devicePath);
  }

  public boolean open() {
    try {
      Process su = Runtime.getRuntime().exec("su");
      su.getOutputStream().write(("chmod 666 " + device.getAbsolutePath() + "\n").getBytes());
      if ((su.waitFor() == 0) && device.canRead() && device.canWrite()) {
        Process process = Runtime.getRuntime().exec("su -c cat " + device.getAbsolutePath());
        inputStream = process.getInputStream();
        outputStream = process.getOutputStream();
        return true;
      } else {
        return false;
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
      return false;
    }
  }

  public int write(byte[] data) {
    try {
      if (outputStream != null) {
        outputStream.write(data);
        return data.length;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public int read(byte[] buffer) {
    try {
      if (inputStream != null) {
        return inputStream.read(buffer);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public void close() {
    try {
      if (inputStream != null) {
        inputStream.close();
      }
      if (outputStream != null) {
        outputStream.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
