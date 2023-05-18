

//Create the concreat Aggreagate class
public class NotifacationCollection implements Collection{

    public static final int  max = 6;
    int itemsNumber = 0;

    private Notifaction[] notifactions;

    public NotifacationCollection(){
        this.notifactions = new Notifaction[max];
        
        addItem("Notifiaction1");
        addItem("Notifiaction2");
        addItem("Notifiaction3");
        addItem("Notifiaction4");
    }

    public void addItem(String notification){

        Notifaction notifaction = new Notifaction(notification);
        if(itemsNumber >= max)
            System.out.println("FULL");
        else
            notifactions[itemsNumber] = notifaction;
    }

    @Override
    public Iterator creatIterator(){
        return  new  NotificationIterator(notifactions);
    }



}
