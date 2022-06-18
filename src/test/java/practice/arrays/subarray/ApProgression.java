package practice.arrays.subarray;

import java.util.Arrays;

public class ApProgression {
    public static void main(String[] args) {
        int[] A = {3, 5, 1};
        int n = A.length;
        int ans = 1;
        Arrays.sort(A);
        int diff = 0;
        if(n>1)
            diff = A[1]-A[0];
        for (int i=0;i<n-1;i++){
            if(diff != A[i+1]-A[i])
                ans = 0;
        }
        System.out.println(ans);
    }
}
