package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodPacketDistribution {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10000, 20000, 30000));
        int B = 6;
        int ans = solve(A,B);
        System.out.println(ans);
    }
    public static int solve(ArrayList<Integer> A, int B) {
        long sum = 0;
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i:A){
            sum += i;
            min = Math.min(i,min);
        }
        if (sum<B){
            return ans;
        }
        int l = 1;
        int r = min;
        while (l<=r){
            int mid = (l+r)/2;
            if (checkVal(mid,A,B)){
                ans = mid;
                l = mid+1;
            }else {
                r = mid-1;
            }
        }
        return ans;
    }

    private static boolean checkVal(int mid, ArrayList<Integer> A, int B) {
        long req = 0;
        for (int i:A){
            req += i/mid;
        }
        return req>=B;
    }
}
