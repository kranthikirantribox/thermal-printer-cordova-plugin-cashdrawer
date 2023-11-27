package de.paystory.thermal_printer;

import android.util.Log;

import com.dantsu.escposprinter.EscPosPrinterCommands;
import com.dantsu.escposprinter.exceptions.EscPosConnectionException;
import com.dantsu.escposprinter.connection.DeviceConnection;

public class CustomEscPosPrinterCommands extends EscPosPrinterCommands {
  private DeviceConnection printerConnection; // You need to pass the connection when constructing

  public CustomEscPosPrinterCommands(DeviceConnection printerConnection) throws EscPosConnectionException {
    super(printerConnection);
    if (printerConnection == null) {
      throw new EscPosConnectionException("Invalid");
    } else if (!printerConnection.isConnected()) {
      throw new EscPosConnectionException("disconnected printer connection");
    } else if (printerConnection == null || !printerConnection.isConnected()) {
      throw new EscPosConnectionException("Invalid or disconnected printer connection");
    }

    this.printerConnection = printerConnection;
  }

  @Override
  public CustomEscPosPrinterCommands openCashBox() throws EscPosConnectionException {
    if (!this.printerConnection.isConnected()) {
      return this;
    } else {
      this.printerConnection.write(new byte[] { 16, 20, 0, 0, 0 }); // Your custom command
      this.printerConnection.send(100);
      return this;
    }
  }
}
