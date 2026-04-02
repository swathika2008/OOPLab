interface Switchable {
    void turnOn();
    void turnOff();
}

class SmartLight implements Switchable {
    public void turnOn() { System.out.println("Light ON: Brightness 80%"); }
    public void turnOff() { System.out.println("Light OFF"); }
}

class SmartFan implements Switchable {
    public void turnOn() { System.out.println("Fan ON: Speed 3"); }
    public void turnOff() { System.out.println("Fan OFF"); }
}

class SmartHub {
    void activateDevice(Switchable device) {
        device.turnOn();
    }
}

public class HomeAutomation {
    public static void main(String[] args) {
        SmartHub hub = new SmartHub();
        hub.activateDevice(new SmartLight());
        hub.activateDevice(new SmartFan());
    }
}
