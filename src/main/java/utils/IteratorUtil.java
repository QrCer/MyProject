package utils;

/**
 * Created by QrCeric on 20/02/2017.
 */
public class IteratorUtil {

    public static void iteratorFor(int[] ints) {

//        System.out.println(JSON.toJSONString(ints));
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "\t");
        }
        System.out.println("");
    }

    public static void iteratorFor(int[][] ints) {

        for (int i = 0; i < ints.length; i++) {
            iteratorFor(ints[i]);
            System.out.println("\r\n");
        }
    }
}
