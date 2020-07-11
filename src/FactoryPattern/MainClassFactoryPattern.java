package FactoryPattern;

public class MainClassFactoryPattern {

    public static void main(String[] args) {

//        Notification notification = new SMSNotification();
//        notification.sendNotification();

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotificationMode(NotificationModes.Email);
        notification.sendNotification();
    }
}
