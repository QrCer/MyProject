package experiment;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by QrCeric on 22/03/2017.
 */
public class case1 {

    private static ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
    private static final String KEY = "key";

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task(concurrentHashMap, KEY));
        }
        try {
            Thread.sleep(300);
            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}