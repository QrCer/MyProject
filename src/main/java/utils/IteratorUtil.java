package utils;


import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/**
 * Created by QrCeric on 20/02/2017.
 * 遍历列表至少3种常用方式:
 * For循环对于ArrayList性能最好,对于LinkedList性能极差
 * Iterator性能居中,两种List无差别.
 * ForEach性能最差,两种List无差别.
 * <p>
 * 极端情况可以根据是否实现RandomAccess接口选择方法遍历.
 */
public class IteratorUtil {

    public static void iteratorFor(int[] ints) {
        //变量size不要放在for循环内,影响性能
        int size = ints.length;
        for (int i = 0; i < size; i++) {
            printElement(ints[i]);
        }
        System.out.println("");
    }

    public static void iteratorFor(List list) {
        //变量size不要放在for循环内,影响性能
        int size = list.size();
        for (int i = 0; i < size; i++) {
            printElement(list.get(i));
        }
        System.out.println("");
    }

    public static <E> void iteratorForEach(List<E> list) {
        for (E i : list) {
            printElement(i);
        }
    }

    public static void iteratorForEach(int[] ints) {
        for (int i : ints) {
            printElement(ints[i]);
        }
    }

    public static <E> void iteratorMethod(List<E> list) {
        for (Iterator<E> iterator = list.iterator(); iterator.hasNext(); ) {
            printElement(iterator.next());
        }
    }

    public static void iteratorRandomAccess(List list) {
        if (list instanceof RandomAccess) {
            iteratorFor(list);
        }else {
            iteratorMethod(list);
        }

    }


    public static void iteratorFor(int[][] ints) {
        //变量size不要放在for循环内,影响性能
        int size = ints.length;
        for (int i = 0; i < size; i++) {
            iteratorFor(ints[i]);
            System.out.println("\r\n");
        }
    }

    public static void printElement(Object o) {
        System.out.print(o + "\t");
    }
}
