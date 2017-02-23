package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 内部类,延迟加载,线程安全,效率高,推荐使用
 */
public class Singleton7 {

    private Singleton7() {
    }

    private static class InstanceHolder {
        private static Singleton7 instance = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return InstanceHolder.instance;
    }
}
