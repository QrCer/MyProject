package algorithm;

import utils.IteratorUtil;


/**
 * Created by QrCeric on 19/02/2017.
 * 给定数字, 回行填入数组
 * todo: 不可开方数也可以打印
 */
public class ArrayIterator {

    public static void main(String[] args) {

        int num = 225;   //定义数字长度

        long startTime = System.nanoTime();
        int[][] result = iteratorNumber(num);
        System.out.println("Duration: " + (System.nanoTime() - startTime) + "\r\n");

        IteratorUtil.iteratorFor(result);
    }

    public static int[][] iteratorNumber(int num) {

        int n = (int) Math.sqrt(num);   //求正方形数组大小
        if (num != n * n) {     //如果不是正方形,返回空
            return null;
        }
        int[][] ints = new int[n][n];   //初始化数组

        int number = 0;     //初始值

        int start = 0;      //开始填入数值的行
        int end = n - 1;    //开始填入数值的列


        while (number < num) {

            int step = 0;

            for (step = 0; step < n - 1; step++) {
                ints[start][start + step] = ++number;
            }

            for (step = 0; step < n - 1; step++) {
                ints[start + step][end] = ++number;
            }

            for (step = 0; step < n - 1; step++) {
                ints[end][end - step] = ++number;
            }

            for (step = 0; step < n - 1; step++) {
                ints[end - step][start] = ++number;
            }

            start++;
            end--;
            if (n > 2) {
                n -= 2;
            } else {
                n = 1;
            }

            if (start >= end) {
                if (number >= num) {
                    break;
                }
                ints[start][end] = ++number;
                break;
            }
        }
        return ints;
    }


}


