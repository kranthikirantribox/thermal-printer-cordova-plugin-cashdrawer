## Cordova Plugin for Thermal Printer's


### Install

#### Cordova

    $ cordova plugin add https://github.com/kranthikiranburra/qz-thermal-printer.git

#### Ionic

    $ ionic cordova plugin add https://github.com/kranthikiranburra/qz-thermal-printer.git


```xml
<uses-feature android:name="android.hardware.usb.host" />
<uses-permission android:maxSdkVersion="30" android:name="android.permission.BLUETOOTH" />
<uses-permission android:maxSdkVersion="30" android:name="android.permission.BLUETOOTH_ADMIN" />
<uses-permission android:name="android.permission.BLUETOOTH_CONNECT" />
<uses-permission android:name="android.permission.BLUETOOTH_SCAN" />
```

Run this for getting Bluetooth access permission if needed

```javascript
ThermalPrinter.requestBTPermissions({type: 'bluetooth'}, function(result){ console.log(result) }, function(error){ console.log(error) });
```

### Examples

#### Notice for TypeScript-Developers

You can easily import and use the ThermalPrinter plugin in your TypeScript-Projects.

```typescript
import { ThermalPrinterPlugin } from 'thermal-printer-cordova-plugin/src';

declare let ThermalPrinter: ThermalPrinterPlugin;
```
```

**Notice:** If not working please ensure that your device can ping the printer. And the printer must be a POSPrinter!
Also ensure that you're using the correct port. 9100 is default for the thermal printers.

#### Print via USB (incl. listPrinters and requestPermissions)

1. First we get our printer because we don't know the printer's ID.
2. Then we request permissions for printing. This is needed because Android will not allow us to access all devices.
3. And finally we can print with our device.

```javascript
ThermalPrinter.listPrinters({type: 'usb'}, function(printers) {
    if (printers.length > 0) {
        var printer = printers[0];
        ThermalPrinter.requestPermissions(printer, function() {
            // Permission granted - We can print!
            ThermalPrinter.printFormattedText({
                type: 'usb',
                id: printer.id,
                text: '[C]<u><font size='big'>Hello World</font></u>' // new lines with "\n"
            }, function() {
                console.log('Successfully printed!');
            }, function(error) {
                console.error('Printing error', error);
            });
        }, function(error) {
            console.error('Permission denied - We can\'t print!');
        });
    } else {
        console.error('No printers found!');
    }
}, function(error) {
    console.error('Ups, we cant list the printers!', error);
});
```

### listPrinters(data, successCallback, errorCallback)
