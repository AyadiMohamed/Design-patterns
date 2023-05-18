public class Main {
    public static void main(String[] args) {

        NotifacationCollection notifacationCollection = new NotifacationCollection();
        NotificationBar notificationBar = new NotificationBar(notifacationCollection);
        notificationBar.printNotification();
    }
}