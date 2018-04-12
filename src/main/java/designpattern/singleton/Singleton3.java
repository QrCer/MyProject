/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 懒汉式, 线程不安全
 */
public class Singleton3 {

    /**
     * Field instance ... <br/>
     */
    private static Singleton3 instance;

    /**
     * Constructor Singleton3 ... <br/>
     * ------------------------------------
     */
    private Singleton3() {
    }

    /**
     * Method getInstance ... <br/>
     * .
     * @return Singleton3
     * .
     * @author ........Dong.Qirui
     */
    public static Singleton3 getInstance() {
        if (null == instance) {
            instance = new Singleton3();
        }

        return instance;
    }
}
