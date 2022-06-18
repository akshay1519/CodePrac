package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 5, 4, 3));
        int ans = maxArea(A);
        System.out.println(ans);

    }
    public static int maxArea(ArrayList<Integer> A) {
        int l = 0;
        int r = A.size()-1;
        int i = 0;
        int ans = Integer.MIN_VALUE;
        while (l<r){
            int diff = (r-l);
            int currAns = diff * (Math.min(A.get(l), A.get(r)));
            ans = Math.max(currAns, ans);
            if (A.get(l)<A.get(r)) {
                l++;
            }else {
                r--;
            }
        }
        return ans;
    }
}
