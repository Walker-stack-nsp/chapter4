public abstract class Notification {

    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    // Abstract method to send the notification
    public abstract void send();
}
