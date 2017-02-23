package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 懒汉式,线程安全,推荐使用
 */
public class Singleton6 {

    private Singleton6() {
    }

    private static Singleton6 instance;

    public static Singleton6 getInstance() {
        if (null == instance) {
            synchronized (Singleton6.class) {
                if (null == instance) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
