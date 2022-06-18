package practice.arrays.advance;

import java.util.Arrays;
import java.util.List;

public class AbsDIfference {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 3, -1);
        int n = A.size();
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        int ans = 0;
        for (int i=0;i<n;i++){
            max1 = Math.max(A.get(i)+i,max1);
            min1 = Math.min(A.get(i)+i,min1);
            max2 = Math.max(A.get(i)-i,max2);
            min2 = Math.min(A.get(i)-i,min2);
        }
        ans = Math.max(Math.abs(max1-min1),Math.abs(max2-min2));
        System.out.println(ans);
    }
}
