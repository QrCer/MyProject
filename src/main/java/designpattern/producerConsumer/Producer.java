package designpattern.producerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by QrCeric on 22/02/2017.
 */
public class Producer implements Runnable {
    private static final int SLEEP_TIME = 1000;
    private static AtomicInteger atomicInteger = new AtomicInteger();
    private volatile boolean runningFlag = true;
    private BlockingQueue<PCData> blockingQueue;

    Producer(BlockingQueue<PCData> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        PCData pcData;
        Random random = new Random();

        System.out.println("Producer is start: " + Thread.currentThread().getId());

        try {
            while (runningFlag) {
                pcData = new PCData(atomicInteger.incrementAndGet());
                if (!blockingQueue.offer(pcData)) {
                    System.out.println("Producer " + Thread.currentThread().getId() + " failed to put data: " + pcData);
                }
                Thread.sleep(random.nextInt(SLEEP_TIME));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        runningFlag = false;
    }
}
