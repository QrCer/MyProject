package algorithm.sorting;

import utils.IteratorUtil;
import utils.RandomUtil;
import utils.SwapUtil;

/**
 * Created by QrCeric on 20/02/2017.
 * O(n²)
 */
public class Bubble {


    public static void main(String[] args) {

        int[] x = RandomUtil.newRandomArray();

        IteratorUtil.iteratorFor(x);

        IteratorUtil.iteratorFor(bubbleSort(x));

    }

    public static int[] bubbleSort(int[] x) {

        int l = x.length;

        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    SwapUtil.swap(x, j, j + 1);
                }
            }
        }

        return x;
    }
}
