/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package algorithm;

/**
 * Created by QrCeric on 24/04/2017.
 */
public class ByteUtil {

    /**
     * 计算数字中1的个数
     *
     * @param n the n
     * @return the int
     */
    public static int countOne(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }

            n >>= 1;
        }

        return count;
    }

    /**
     * 计算数字中1的个数
     *
     * @param n the n
     * @return the int
     */
    public static int countOne2(int n) {
        int count = 0;

        while (n > 0) {
            if (n != 0) {
                n = n & (n - 1);
                count++;
            }
        }

        return count;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(countOne2(7));
    }

    /**
     * 计算m的n次方
     *
     * @param m the m
     * @param n the n
     * @return the int
     */
    public static int powerN(int m, int n) {
        for (int i = 0; i < n; i++) {
            m <<= 1;
        }

        if ((n % 2 == 0) && (m < 0)) {
            m = -m;
        }

        return m;
    }

    /**
     * 判断是否是2的n次方
     *
     * @param n the n
     * @return the boolean
     */
    public static boolean isPoweredByTwo(int n) {
        if (n < 1) {
            return false;
        }

        int i = 1;

        while (i <= n) {
            if (i == n) {
                return true;
            }

            i <<= 1;
        }

        return false;
    }

    /**
     * 判断是否是2的n次方
     *
     * @param n the n
     * @return the boolean
     */
    public static boolean isPoweredByTwo2(int n) {
        if (n < 1) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
}
