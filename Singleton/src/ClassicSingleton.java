//classic java implementation of singleton
public class ClassicSingleton {

    private static ClassicSingleton obj;

    private ClassicSingleton(){};

    public static ClassicSingleton getInstance(){
        if (obj == null){
            obj = new ClassicSingleton();
        }
        return obj;
    }
}
