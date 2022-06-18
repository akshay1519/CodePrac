package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecialInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int B = 10;
        int n = A.size();
        int l = 1;
        int r = n;
        int ans = 0;
        while (l<=r){
            int mid = (l+r)/2;
            if (isPossible(A,B,mid)){
                ans = mid;
                l = mid+1;
            }else {
                r = mid-1;
            }
        }
        System.out.println(ans);

    }

    private static boolean isPossible(ArrayList<Integer> a, int b, int mid) {
        long curSum = 0;
        for (int i=0;i<mid;i++){
            curSum += a.get(i);
        }
        if (curSum > b){
            return false;
        }
        for (int i=mid;i<a.size();i++){
            curSum = curSum - a.get(i-mid)+a.get(i);
            if (curSum>b)
                return false;
        }
        return true;
    }
}
