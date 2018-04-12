/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.producerConsumer;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by QrCeric on 23/02/2017.
 */
public class Consumer implements Runnable {

    /**
     * Field SLEEP_TIME ... <br/>
     */
    private static final int SLEEP_TIME = 1000;

    /**
     * Field runningFlag ... <br/>
     */
    private volatile boolean runningFlag = true;

    /**
     * Field blockingQueue ... <br/>
     */
    private BlockingQueue<PCData> blockingQueue;

    /**
     * Constructor Consumer ... <br/>
     * ------------------------------------
     * @param blockingQueue
     * ------------------------------------
     */
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

                    System.out.println(
                            MessageFormat.format("{0}*{1}={2}", pcData.getIntData(), pcData.getIntData(), result));
                    Thread.sleep(random.nextInt(SLEEP_TIME));
                }
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
