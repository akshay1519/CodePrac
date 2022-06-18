package practice.problemsolving;

import java.util.Arrays;

public class CountDuplicates {
    public static void main(String[] args) {
        final int[] A = {1, 10, 20, 1, 25, 1, 10, 30, 25, 1};
        int[] temp = new int[A.length];
        Arrays.sort(A);
        int count = 0;
        for (int i = 0;i<A.length-1;i++){
            if(A[i]==A[i+1])
               count++;
        }
        System.out.println(count);
    }
}
