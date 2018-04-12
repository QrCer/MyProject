/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by QrCeric on 24/02/2017.
 * 1    278748225   222985368
 * 2    315071043   236798184
 * 3    211576802   151572011
 * 4    255780777   225158519
 * 5    158290415   120128879
 * 6    195020542   129446022
 * 7    269716341   351986426
 * 8    151209568   131235834
 */
public class Test {

    /**
     * Method main ... <br/>
     * .
     * @param args
     * .
     * @throws InterruptedException
     * .
     * @author ........Dong.Qirui
     */
    public static void main(String[] args) throws InterruptedException {

        // testALL();
        testConcurrent();
    }

    /**
     * Method testALL ... <br/>
     * .
     * @author ........Dong.Qirui
     */
    public static void testALL() {
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

    /**
     * Method testConcurrent ... <br/>
     * .
     * @throws InterruptedException
     * .
     * @author ........Dong.Qirui
     */
    public static void testConcurrent() throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Long            start           = System.nanoTime();
        List<Runnable>  list            = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            list.add(new InitSingleton());
        }

        for (int i = 0; i < 100; i++) {
            executorService.execute(list.get(i));
        }

        executorService.shutdown();

        Long end = System.nanoTime();

        Thread.sleep(1000);
        System.out.println("time is: " + (end - start));
    }

    /**
     * Class ..........InitSingleton <br/>
     * .
     * @date ..........2018-04-12
     * @author ........Dong.Qirui
     */
    public static class InitSingleton implements Runnable {
        @Override
        public void run() {
            Singleton6 singleton = Singleton6.getInstance();

            System.out.println(singleton);
        }
    }
}
