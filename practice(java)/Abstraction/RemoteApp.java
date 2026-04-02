interface RemoteControl {
    int MIN_VOLUME = 0;
    int MAX_VOLUME = 100;

    void changeChannel(int number);
    
    default void displayBrand(String brand) {
        System.out.println("Remote connected to: " + brand);
    }
}

class SonyTV implements RemoteControl {
    public void changeChannel(int number) {
        System.out.println("Sony TV switching to Channel " + number);
    }
}

class SamsungTV implements RemoteControl {
    public void changeChannel(int number) {
        System.out.println("Samsung TV switching to Channel " + number);
    }
}

public class RemoteApp {
    public static void main(String[] args) {
        RemoteControl remote = new SonyTV();
        remote.displayBrand("Sony Bravia");
        remote.changeChannel(5);
        System.out.println("Max Volume Allowed: " + RemoteControl.MAX_VOLUME);
    }
}
