class Notifier {
    public void send(String msg) {
        System.out.println("General Alert: " + msg);
    }

    protected void send(String msg, String email) {
        System.out.println("Email sent to " + email + ": " + msg);
    }

    void send(String msg, long phone) {
        System.out.println("SMS sent to " + phone + ": " + msg);
    }

    private void logger(String msg) {
        System.out.println("[Internal Log]: " + msg);
    }

    public void sendWithLog(String msg) {
        logger(msg);
        send(msg);
    }
}

class AppNotifier extends Notifier {
    public void displayCapabilities() {
        send("System Update");
        send("Welcome!", "user@email.com");
        send("OTP: 1234", 1234567890L);
    }
}

public class Sms {
    public static void main(String[] args) {
        AppNotifier app = new AppNotifier();
        app.displayCapabilities();
        app.sendWithLog("Security Alert");
    }
}
