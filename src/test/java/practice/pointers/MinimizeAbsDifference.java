package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimizeAbsDifference {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 4, 5, 8, 10));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(6, 9, 15));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList( 2, 3, 6, 6 ));
        int ans = solve(A,B,C);
        System.out.println(ans);
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ans = Integer.MAX_VALUE;
        while (i<A.size() && j <B.size() && k<C.size()){
            int min = Math.min(Math.min(A.get(i),B.get(j)),C.get(k));
            int max = Math.max(Math.max(A.get(i),B.get(j)),C.get(k));
            ans = Math.min(ans,max-min);
            if (min == A.get(i))i++;
            else if(min == B.get(j))j++;
            else k++;
        }
        return ans;
    }
}
