package factory_pattern;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("SMS notification");	
	}
}

class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Email notification");	
	}
}

class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Push notification");		
	}
}
