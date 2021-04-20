
public class NotificationFactory {

    public static Notification createNotification(String channel) {
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new RuntimeException(String.format("Channel %s not reckognized", channel));
        }
    }
}
