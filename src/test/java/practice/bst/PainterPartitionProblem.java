package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;

public class PainterPartitionProblem {
    public static void main(String[] args) {
        int A = 7;
        int B = 1;
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList( 23, 6, 13, 70, 38, 94, 20, 44, 66, 34, 26, 94, 63, 38, 44, 90, 50, 59, 23, 47, 85, 17, 72, 39, 47, 85));
        int ans = paint(A,B,C);
        System.out.println(ans);

    }
    public static int paint(int A, int B, ArrayList<Integer> C) {
        long ansMin = Integer.MIN_VALUE;
        long ansMax = 0;
        long mod = 10000003;
        long ans = 0;
        int n = C.size();
        for (int i:C){
            ansMax += i;
            if (i>ansMin){
                ansMin = i;
            }
        }
        if (A >= n){
            ans = ((ansMin % mod) * (B % mod)) % mod;
            return (int) ans;
        }
        while (ansMax>=ansMin) {
            long mid = ansMin + (ansMax - ansMin) / 2;
            if (checkFunc(mid, A , C)) {
                ans = mid;
                ansMax = mid-1;
            }else {
                ansMin = mid+1;
            }
        }
        ans = ((ans % mod) * (B % mod)) % mod;
        return (int) ans;
    }
    public static boolean checkFunc(long time,int A,ArrayList<Integer> C){
        boolean flag = false;
        int n = C.size();
        long sum = 0;
        for (int i=0;i<n;i++){
            sum += C.get(i);
            if (sum > time){
                sum = C.get(i);
                A--;
            }else if(sum == time){
                sum = 0;
                if (i != n-1)
                    A--;
            }
        }
        if (A>0){
            flag = true;
        }
        return flag;
    }
}
