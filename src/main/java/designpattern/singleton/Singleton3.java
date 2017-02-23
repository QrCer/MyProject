package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 懒汉式, 线程不安全
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (null == instance) {
            instance = new Singleton3();
        }
        return instance;
    }
}
