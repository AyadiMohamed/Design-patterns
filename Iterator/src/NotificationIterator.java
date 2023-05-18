public class NotificationIterator implements Iterator{

    Notifaction[] notifactions;
    int pos = 0;

    public NotificationIterator(Notifaction[] notifactions) {
        this.notifactions = notifactions;
    }

    @Override
    public Object next(){
        Notifaction notifaction = notifactions[pos];
        pos+=1;
        return notifaction;
    }

    @Override
    public boolean hasNext(){
        if (pos >= notifactions.length || notifactions[pos] == null)
            return false;
        else return true;
    }
}
