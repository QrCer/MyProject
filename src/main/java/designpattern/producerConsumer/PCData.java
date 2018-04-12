/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.producerConsumer;

/**
 * Created by QrCeric on 22/02/2017.
 */
public class PCData {

    /**
     * Field intData ... <br/>
     */
    private final int intData;

    /**
     * Constructor PCData ... <br/>
     * ------------------------------------
     * @param i
     * ------------------------------------
     */
    PCData(int i) {
        this.intData = i;
    }

    /**
     * Constructor PCData ... <br/>
     * ------------------------------------
     * @param string
     * ------------------------------------
     */
    PCData(String string) {
        this.intData = Integer.valueOf(string);
    }

    @Override
    public String toString() {
        return "intData is: " + intData;
    }

    /**
     * Method getIntData ... <br/>
     * .
     * @return int
     * .
     * @author ........Dong.Qirui
     */
    public int getIntData() {
        return this.intData;
    }
}
