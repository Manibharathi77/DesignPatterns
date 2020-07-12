package FactoryPattern;

public class MainClassFactoryPattern {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotificationMode(NotificationModes.Email);
        notification.sendNotification();
    }
}
