// Static initializer based Java implementation of singleton design pattern
public class EagerSingleton {

    private static EagerSingleton obj;
    private EagerSingleton(){};
    public static EagerSingleton getInstance(){
        return obj;
    }
}
