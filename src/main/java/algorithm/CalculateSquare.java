package algorithm;

/**
 * Created by QrCeric on 19/02/2017.
 * 计算平方根,根据牛顿递归法
 * 输入欲开方数 x , 随机数 0<y<x , 不断尝试1/2(x+y/x)
 * 大概六七次迭代即可求出.
 */
public class CalculateSquare {

    public static void main(String[] args) {
        double x = 9;

        long startTime = System.nanoTime();
        double result = sqrt(x);
        System.out.println("Duration: " + (System.nanoTime() - startTime));
        System.out.println(result);

        startTime = System.nanoTime();
        double result1 = Math.sqrt(x);
        System.out.println("Duration: " + (System.nanoTime() - startTime));
        System.out.println(result1);
    }

    public static double sqrt(double x) {

        if (x < 0) {
            return Double.NaN;
        }

        double error = 1e-15;
        double y = x;

//        int i = 0;
        while (Math.abs(y - x / y) > error * y) {
            y = (y + x / y) / 2.0D;
//            i++;
//            System.out.println("y is: " + y);
        }
//        System.out.println("i is: " + i);

        return y;
    }

}
