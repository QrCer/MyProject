package algorithm.sorting;

import utils.IteratorUtil;
import utils.RandomUtil;
import utils.SwapUtil;

/**
 * Created by QrCeric on 21/02/2017.
 * O(n²)
 */
public class Selection {

    public static void main(String[] args) {

        int[] x = RandomUtil.newRandomArray();

        IteratorUtil.iteratorFor(x);
        IteratorUtil.iteratorFor(selectionSort(x));

    }

    public static int[] selectionSort(int[] x) {

        int l = x.length;

        for (int i = 0; i < l - 1; i++) {
            int min = i;
            for (int j = i + 1; j < l; j++) {
                if (x[min] > x[j]) {
                    min = j;
                }
            }
            if (min != i) {
                SwapUtil.swap(x, i, min);
            }
        }

        return x;
    }

}
