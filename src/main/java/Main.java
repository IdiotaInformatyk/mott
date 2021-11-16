import javax.usb.*;
import java.util.List;

public class Main {
    public static final short VID = 0x0403;
    public static final short PID = 0x6010;

    public static void main(String[] args) {
        UsbDevice usbDevice;
        try {
            usbDevice = findDevice(UsbHostManager.getUsbServices().getRootUsbHub(), VID, PID);
        } catch (UsbException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public static UsbDevice findDevice(UsbHub hub, short vendorId, short productId)
    {
        for (UsbDevice device : (List<UsbDevice>) hub.getAttachedUsbDevices())
        {
            UsbDeviceDescriptor desc = device.getUsbDeviceDescriptor();
            if (desc.idVendor() == vendorId && desc.idProduct() == productId) return device;
            if (device.isUsbHub())
            {
                device = findDevice((UsbHub) device, vendorId, productId);
                if (device != null) return device;
            }
        }
        return null;
    }
}
