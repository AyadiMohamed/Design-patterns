public class Main {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notifaction notifaction = notificationFactory.createNotification("email");
        notifaction.userNotify();
    }
}