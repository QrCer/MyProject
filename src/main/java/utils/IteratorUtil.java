package utils;


import java.util.Iterator;

/**
 * Created by QrCeric on 20/02/2017.
 */
public class IteratorUtil {

    public static void iteratorFor(int[] ints) {

        int size= ints.length;
        for (int i = 0; i < size; i++) {
            printElement(ints[i]);
        }
        System.out.println("");
    }

    public static void iteratorFor(int[][] ints) {

        int size= ints.length;
        for (int i = 0; i < size; i++) {
            iteratorFor(ints[i]);
            System.out.println("\r\n");
        }
    }


    public static void iteratorForEach(int[] ints){
        for (int i:ints) {
            printElement(ints[i]);
        }
    }
//
//    public static void iterator(List list){
////        Iterator<String> iterator = list.iterator
//    }

    public static void printElement(int i){
        System.out.print(i + "\t");
    }
}
