package designpattern.producerConsumer;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by QrCeric on 23/02/2017.
 */
public class Consumer implements Runnable {
    private static final int SLEEP_TIME = 1000;
    private volatile boolean runningFlag = true;
    private BlockingQueue<PCData> blockingQueue;

    Consumer(BlockingQueue<PCData> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        PCData pcData;
        Random random = new Random();

        System.out.println("Consumer is start: " + Thread.currentThread().getId());

        try {
            while (runningFlag) {
                pcData = blockingQueue.take();
                if (null != pcData) {
                    long result = pcData.getIntData() * pcData.getIntData();
                    System.out.println(MessageFormat.format("{0}*{1}={2}", pcData.getIntData(), pcData.getIntData(), result));
                    Thread.sleep(random.nextInt(SLEEP_TIME));
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void stop() {
        runningFlag = false;
    }
}
