// Double-Checked Locking based Java implementation of singleton design pattern
public class DoubleCheckedLockSingelton {

    private static DoubleCheckedLockSingelton obj;
    private DoubleCheckedLockSingelton(){};
    public static DoubleCheckedLockSingelton getInstance(){
        if(obj == null){
            // To make thread safe
            synchronized (DoubleCheckedLockSingelton.class){
                // check again as multiple thread can reach above step
                if(obj == null){
                    obj = new DoubleCheckedLockSingelton();
                }
            }
        }
        return obj;
    }
}
