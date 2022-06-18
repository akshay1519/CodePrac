package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;

public class KthPrice {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,1,4,3,2));
        int B = 3;
        int ans = kthsmallest(A, B);
        System.out.println(ans);
    }

    public static int kthsmallest(final ArrayList<Integer> A, int B) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : A) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int ans = max;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int count = findCount(A, mid);
            if (count>=B){
                ans = mid;
                max = mid-1;
            }else {
                min = mid+1;
            }
        }
        return ans;
    }

    public static int findCount(ArrayList<Integer> A, int max) {
        int count = 0;
        for (int i : A) {
            if (i <= max) count++;
        }
        return count;
    }
}

