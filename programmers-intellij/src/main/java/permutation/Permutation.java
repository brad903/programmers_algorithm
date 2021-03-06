package permutation;

import java.util.Arrays;

public class Permutation {
    void myswap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void permutation(int[] arr, int d, int n, int r) {
        if (r == 0) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, d)));
            return;
        }
        for (int i = d; i < n; i++) {
            myswap(arr, d, i);
            permutation(arr.clone(), d + 1, n, r - 1);
//            myswap(arr, d, i);
        }
    }

}
