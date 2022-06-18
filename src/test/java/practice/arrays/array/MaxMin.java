package practice.arrays.array;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] A = {-2, 1, -4, 5, 3};
        int n = A.length;
        Arrays.sort(A);
        int ans = A[n-1]+A[0];
    }
}
