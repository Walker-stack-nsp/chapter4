public class SmsNotification extends Notification {

    public SmsNotification(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.println("Routing via SMS: " + message);
    }
}