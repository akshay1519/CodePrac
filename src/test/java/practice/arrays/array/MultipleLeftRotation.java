package practice.arrays.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleLeftRotation {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 3};
        int[][] fAns = new int[B.length][A.length];
        int n = A.length;
//        System.out.println(B[0] = B[0]%n);
        for (int i=0;i<B.length;i++){
            ArrayList<Integer> ans = new ArrayList<>();
            B[i] = B[i]%n;
            for (int j = B[i];j<n;j++){
                ans.add(A[j]);
            }
            for (int k = 0;k<B[i];k++){
                ans.add(A[k]);
            }
            System.out.println(ans);
            for (int m=i;m<B.length;m++){
                for (int l=0;l<n;l++){
                    fAns[m][l] = ans.get(l);
                }
            }
        }
        for (int i=0;i<B.length;i++){
                System.out.println(Arrays.toString(fAns[i]));
            }
    }
}
