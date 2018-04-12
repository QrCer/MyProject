/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 饿汉式
 */
public class Singleton2 {

    /**
     * Field instance ... <br/>
     */
    private static Singleton2 instance = null;

    static {
        instance = new Singleton2();
    }

    /**
     * Constructor Singleton2 ... <br/>
     * ------------------------------------
     */
    private Singleton2() {
    }

    /**
     * Method getInstance ... <br/>
     * .
     * @return Singleton2
     * .
     * @author ........Dong.Qirui
     */
    public static Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }

        return instance;
    }
}
