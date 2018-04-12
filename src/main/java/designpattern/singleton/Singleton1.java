/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 饿汉式, 但是线程安全
 */
public class Singleton1 {

    /**
     * Field instance ... <br/>
     */
    private static Singleton1 instance = new Singleton1();

    /**
     * Constructor Singleton1 ... <br/>
     * ------------------------------------
     */
    private Singleton1() {
    }

    /**
     * Method getInstance ... <br/>
     * .
     * @return Singleton1
     * .
     * @author ........Dong.Qirui
     */
    public static Singleton1 getInstance() {
        return instance;
    }
}
