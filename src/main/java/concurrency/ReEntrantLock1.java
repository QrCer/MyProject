package concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by QrCeric on 17/02/2017.
 */
public class ReEntrantLock1 {

    public static ReentrantLock lock1 = new ReentrantLock(false);

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
