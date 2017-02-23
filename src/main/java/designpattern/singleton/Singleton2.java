package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 饿汉式
 */
public class Singleton2 {

    private static Singleton2 instance = null;

    private Singleton2() {
    }

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }

}
