/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by QrCeric on 17/02/2017.
 */
public class ReEntrantLock1 {
    public static ReentrantLock lock1 = new ReentrantLock(false);

    /**
     * Method main ... <br/>
     * .
     * @param args
     * .
     * @author ........Dong.Qirui
     */
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
