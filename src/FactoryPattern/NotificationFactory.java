package FactoryPattern;

public class NotificationFactory {

   public Notification createNotificationMode(NotificationModes notificationMode){

       switch (notificationMode){
           case SMS:
               return new SMSNotification();
           case Email:
               return new EmailNotification();
           case Push:
               return new PushNotification();
           default:
               return null;
       }
    }

}
