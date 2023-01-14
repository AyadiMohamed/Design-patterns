public class NotificationFactory {

    public Notifaction createNotification(String type){
        if (type == null || type.isEmpty()){
            return null;
        }
        else {
            switch (type){
                case ("sms"):
                    return new SmsNotifcation();
                case ("email"):
                    return new EmailNotifaction();
                case ("push") :
                    return new PushNotification();
                default:
                    throw new IllegalArgumentException("Unknown type "+type);

            }
        }

    }
}
