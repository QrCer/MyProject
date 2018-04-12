/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.producerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by QrCeric on 22/02/2017.
 */
public class Producer implements Runnable {

    /**
     * Field SLEEP_TIME ... <br/>
     */
    private static final int SLEEP_TIME = 1000;

    /**
     * Field atomicInteger ... <br/>
     */
    private static AtomicInteger atomicInteger = new AtomicInteger();

    /**
     * Field runningFlag ... <br/>
     */
    private volatile boolean runningFlag = true;

    /**
     * Field blockingQueue ... <br/>
     */
    private BlockingQueue<PCData> blockingQueue;

    /**
     * Constructor Producer ... <br/>
     * ------------------------------------
     * @param blockingQueue
     * ------------------------------------
     */
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

                if ( !blockingQueue.offer(pcData)) {
                    System.out.println("Producer " + Thread.currentThread().getId() + " failed to put data: " + pcData);
                }

                Thread.sleep(random.nextInt(SLEEP_TIME));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method stop ... <br/>
     * .
     * @author ........Dong.Qirui
     */
    public void stop() {
        runningFlag = false;
    }
}
