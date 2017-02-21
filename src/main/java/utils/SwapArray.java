package utils;

/**
 * Created by QrCeric on 20/02/2017.
 */
public class SwapArray {

    public static void main(String[] args) {

    }

    public static void Swap(int[] x, int i, int j) {
        int l = x.length;

        if (i < l && j < l) {
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
        } else {
            System.out.println(i + ":" + j);
        }
    }
}
