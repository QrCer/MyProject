/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 懒汉式, 线程不安全, 同步块可能会排队实例化instance
 */
public class Singleton5 {

    /**
     * Field instance ... <br/>
     */
    private static Singleton5 instance = null;

    /**
     * Constructor Singleton5 ... <br/>
     * ------------------------------------
     */
    private Singleton5() {
    }

    /**
     * Method getInstance ... <br/>
     * .
     * @return Singleton5
     * .
     * @author ........Dong.Qirui
     */
    public static Singleton5 getInstance() {
        if (null == instance) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }

        return instance;
    }
}
