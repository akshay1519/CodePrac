package practice.arrays.array;

import java.util.Arrays;

public class NobleInteger {
    public static void main(String[] args) {
//        int[] A = {5,6,2}; // 1
//        int[] A = {6,1}; //1
//        int[] A = {1, 2, 7, 0, 9, 3, 6, 0, 6}; //-1
        int[] A = {-4, -2, 0, -1, -6};//1
//        int[] A = {-1, -2, 0, 0, 0, -3};
//        int[] A = {-6,-1,4};
        int n = A.length;
        int ans = -1;
        Arrays.sort(A);
        for (int i=0;i<n;i++){
            System.out.print(A[i]+" , ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(A[i]>=0) {
                if(i<n-1) {
                    if (A[i] != A[i + 1] && n - (i + 1) == Math.abs(A[i]))
                        ans = 1;
                }
                if (max < A[i])
                    max = A[i];
            }
        }
        if (max == 0)
                ans = 1;
        System.out.println(ans);
    }
}
