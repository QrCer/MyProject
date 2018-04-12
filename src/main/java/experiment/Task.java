package experiment;

import java.util.Map;

/**
 * Created by QrCeric on 22/03/2017.
 */
public class Task implements Runnable {
    private Map map;
    private String key;

    Task(Map<String, Integer> map, String key) {
        this.map = map;
        this.key = key;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (map) {
                addValue(map, key);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void addValue(Map<String, Integer> map, String key) {
        Integer value = map.get(key);
//        synchronized (Task.class) {
        if (null == value) {
            map.put(key, 1);
        } else {
            map.put(key, value + 1);
        }
//        }
        System.out.println(value);
    }
}
