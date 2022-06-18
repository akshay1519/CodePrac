package practice.arrays.subarray;

import java.util.Arrays;

public class MinimumABSDifference {
    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        int ans = Integer.MAX_VALUE;
        Arrays.sort(A);
        for (int i=A.length-1;i>0;i--){
            int tempAns = A[i]-A[i-1];
            if(tempAns<ans)
                ans = tempAns;
        }
        System.out.println(ans);
    }
}
