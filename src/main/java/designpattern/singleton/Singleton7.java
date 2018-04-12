/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 内部类,延迟加载,线程安全,效率高,推荐使用
 */
public class Singleton7 {

    /**
     * Constructor Singleton7 ... <br/>
     * ------------------------------------
     */
    private Singleton7() {
    }

    /**
     * Method getInstance ... <br/>
     * .
     * @return Singleton7
     * .
     * @author ........Dong.Qirui
     */
    public static Singleton7 getInstance() {
        return InstanceHolder.instance;
    }

    /**
     * Class ..........InstanceHolder <br/>
     * .
     * @date ..........2018-04-12
     * @author ........Dong.Qirui
     */
    private static class InstanceHolder {

        /**
         * Field instance ... <br/>
         */
        private static Singleton7 instance = new Singleton7();
    }
}
