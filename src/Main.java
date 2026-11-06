import java.util.List;

public class Main {
    void main() {
        List<Notification> notifications = List.of(
                new EmailNotification("Hello via Email!"),
                new SmsNotification("Hello via SMS!"));

        IO.println("Sending notifications...");
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
