package utils;

/**
 * Created by QrCeric on 20/02/2017.
 */
public class RandomArray {

    public static void main(String[] args) {

        IteratorArray.iteratorArray(newRandomArray());
    }

    public static int[] newRandomArray() {
        return newRandomArray(50, 10);
    }

    public static int[] newRandomArray(int range, int size) {

        int[] arr = new int[size];

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            arr[i] = (int) (range * Math.random());
        }

        return arr;

    }
}
