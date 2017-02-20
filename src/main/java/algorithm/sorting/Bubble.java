package algorithm.sorting;

import utils.IteratorArray;
import utils.RandomArray;
import utils.SwapArray;

/**
 * Created by QrCeric on 20/02/2017.
 */
public class Bubble {


    public static void main(String[] args) {

        int[] x = RandomArray.newRandomArray();

        IteratorArray.iteratorArray(x);

        IteratorArray.iteratorArray(BubbleSort(x));

    }

    public static int[] BubbleSort(int[] x) {

        int l = x.length;

        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    SwapArray.Swap(x, j, j + 1);
                }
            }
        }

        return x;
    }
}
