package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 懒汉式, 线程安全, 但效率低
 */
public class Singleton4 {

    private Singleton4(){}

    private static Singleton4 instance;

    public static synchronized Singleton4 getInstance(){
        if (null == instance) {
            instance = new Singleton4();
        }
        return instance;
    }
}
