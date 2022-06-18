package practice.intialassesment;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] A = {8,55,35,68,86,3,38,48,92,97,78,14,57,25,24,17,77,97,71,31,40,46,40,57,18,94,84,0,22,4,21,80,74,71,76,20,48,43,68,32,67,0,23,7,6,25,94,5,35,65,93,74,13,32,41,31,49};
        int n = A.length;
        int sum = 0;
        int ans = 0;
        for (int i=0;i<n;i++){
            sum+=A[i];
        }
        System.out.println(sum);
        Arrays.sort(A);
        if(sum%2==0) {
            ans = sum;
        }else {
            for (int i = 0; i < n; i++) {
                if ((sum-A[i])%2==0) {
                    ans = sum-A[i];
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
