/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.producerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by QrCeric on 22/02/2017.
 */
public class ProducerConsumer {

    /**
     * Method main ... <br/>
     * .
     * @param args
     * .
     * @author ........Dong.Qirui
     */
    public static void main(String[] args) {
        BlockingQueue<PCData> blockingQueue   = new LinkedBlockingDeque<>(10);
        Producer              producer1       = new Producer(blockingQueue);
        Producer              producer2       = new Producer(blockingQueue);
        Producer              producer3       = new Producer(blockingQueue);
        Consumer              consumer1       = new Consumer(blockingQueue);
        Consumer              consumer2       = new Consumer(blockingQueue);
        Consumer              consumer3       = new Consumer(blockingQueue);
        ExecutorService       executorService = Executors.newCachedThreadPool();

        executorService.execute(producer1);
        executorService.execute(producer2);
        executorService.execute(producer3);
        executorService.execute(consumer1);
        executorService.execute(consumer2);
        executorService.execute(consumer3);

        try {
            System.out.println("Sleep: 10s");
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producer1.stop();
        producer2.stop();
        producer3.stop();

        try {
            System.out.println("Sleep: 3s");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Shutdown");
        executorService.shutdown();
    }
}
