package factory_pattern;

public class NotificationFactory {
	public Notification createNotification(String notificationType){
        if (notificationType == null || notificationType.isEmpty())
            return null;
        if (notificationType.equals("SMS")) {
            return new SMSNotification();
        }
        else if (notificationType.equals("EMAIL")) {
            return new EmailNotification();
        }
        else if (notificationType.equals("PUSH")) {
            return new PushNotification();
        }
        return null;
    }
}
