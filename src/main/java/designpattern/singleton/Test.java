package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 */
public class Test {

    public static void main(String[] args) {
        Singleton1 singleton1A = Singleton1.getInstance();
        Singleton1 singleton1B = Singleton1.getInstance();
        System.out.println(singleton1A == singleton1B);

        Singleton2 singleton2A = Singleton2.getInstance();
        Singleton2 singleton2B = Singleton2.getInstance();
        System.out.println(singleton2A == singleton2B);

        Singleton3 singleton3A = Singleton3.getInstance();
        Singleton3 singleton3B = Singleton3.getInstance();
        System.out.println(singleton3A == singleton3B);

        Singleton4 singleton4A = Singleton4.getInstance();
        Singleton4 singleton4B = Singleton4.getInstance();
        System.out.println(singleton4A == singleton4B);

        Singleton5 singleton5A = Singleton5.getInstance();
        Singleton5 singleton5B = Singleton5.getInstance();
        System.out.println(singleton5A == singleton5B);

        Singleton6 singleton6A = Singleton6.getInstance();
        Singleton6 singleton6B = Singleton6.getInstance();
        System.out.println(singleton6A == singleton6B);

        Singleton7 singleton7A = Singleton7.getInstance();
        Singleton7 singleton7B = Singleton7.getInstance();
        System.out.println(singleton7A == singleton7B);

        Singleton8 singleton8A = Singleton8.instance;
        Singleton8 singleton8B = Singleton8.instance;
        System.out.println(singleton8A == singleton8B);
        singleton8A.method();
        singleton8B.method();
        singleton8A.method();
    }
}
