package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 枚举,最佳解决方案,Since1.5,避免线程同步,防止反序列重新创建新的对象.
 */
public enum Singleton8 {

    instance;

    private Singleton8() {
    }

    public void method() {
    }
}
