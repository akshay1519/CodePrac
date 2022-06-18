package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sum3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList( -5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3));
        int B = -1;
        int ans = threeSumClosest(A,B);
        System.out.println(ans);
    }
    public static int threeSumClosest(ArrayList<Integer> A, int B) {
        long diff = Integer.MAX_VALUE;
        Collections.sort(A);;
        for (int i=0;i<A.size();i++) {
            int p1 = i+1;
            int p2 = A.size()-1;
            while (p1<p2){
                int sum = A.get(i)+A.get(p1)+A.get(p2);
                if (Math.abs(B-sum)<Math.abs(B-diff)){
                    diff = sum;
                }
                if (sum>B){
                    p2--;
                }else {
                    p1++;
                }
            }
        }
        return (int)diff;
    }
}
