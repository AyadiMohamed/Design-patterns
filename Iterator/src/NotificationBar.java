public class NotificationBar {

    NotifacationCollection notifacationCollection;

    public NotificationBar(NotifacationCollection notifacationCollection) {
        this.notifacationCollection = notifacationCollection;
    }

    public void printNotification(){
        Iterator Iterator = notifacationCollection.creatIterator();
        System.out.println("----Notifcation Bar-----");
        while (Iterator.hasNext()){
            Notifaction notifaction = (Notifaction) Iterator.next();
            System.out.println(notifaction.getNotification());
        }
    }
}
