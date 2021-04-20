
public class Run {
    public static void main(String[] args) {

        Notification smsNotification = NotificationFactory.createNotification("SMS");
        smsNotification.notifyUser();

        Notification emailNotification = NotificationFactory.createNotification("EMAIL");
        emailNotification.notifyUser();
    }
}
