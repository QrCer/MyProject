package designpattern.singleton;

/**
 * Created by QrCeric on 22/02/2017.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
