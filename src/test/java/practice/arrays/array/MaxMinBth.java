package practice.arrays.array;

import java.util.Arrays;

public class MaxMinBth {
    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        int B = 1;
        int n = A.length;
        Arrays.sort(A);
        System.out.println(A[n-B]+" - "+A[B-1]);
        int ans = A[n-B]-A[B-1];
        System.out.println(ans);
    }
}
