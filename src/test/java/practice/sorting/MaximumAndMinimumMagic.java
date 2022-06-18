package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumMagic {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 11, -1, 5));
        int n = A.size();
        Collections.sort(A);
        int minDiff = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        for (int i=0;i<n-1;i++){
            int val = Math.abs(A.get(i)-A.get(i+1));
        }
    }
}
