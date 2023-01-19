// Thread Synchronized Java implementation of singleton design pattern
public class SynchronizedSingleton {
    private static SynchronizedSingleton obj;

    private SynchronizedSingleton(){};
    // Only one thread can execute this at a time
    public static synchronized SynchronizedSingleton getInstance(){
        if(obj == null){
            obj = new SynchronizedSingleton();
        }
        return obj;
    }
}
