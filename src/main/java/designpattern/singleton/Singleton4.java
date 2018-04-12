/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 懒汉式, 线程安全, 但效率低
 */
public class Singleton4 {

    /**
     * Field instance ... <br/>
     */
    private static Singleton4 instance;

    /**
     * Constructor Singleton4 ... <br/>
     * ------------------------------------
     */
    private Singleton4() {
    }

    /**
     * Method getInstance ... <br/>
     * .
     * @return Singleton4
     * .
     * @author ........Dong.Qirui
     */
    public static synchronized Singleton4 getInstance() {
        if (null == instance) {
            instance = new Singleton4();
        }

        return instance;
    }
}
