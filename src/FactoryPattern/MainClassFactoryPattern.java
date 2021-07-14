package FactoryPattern;

public class MainClassFactoryPattern {

    public static void main(String[] args) {

//        NotificationFactory notificationFactory = new NotificationFactory();
//        Notification notification = notificationFactory.createNotificationMode(NotificationModes.Email);
//        notification.sendNotification();

        FunctionExample functionExample = new FunctionExample();

//        int result = functionExample.calculate(2000,898945,28389235);
//
        String result = functionExample.calculate(2,4,"kum");

        //int result = (2 + 3) * 5;
        System.out.println("Result of the calculation is: " +result);
    }
}
