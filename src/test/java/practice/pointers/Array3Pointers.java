package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array3Pointers {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 4, 10));
        List<Integer> B = new ArrayList<>(Arrays.asList(2, 15, 20));
        List<Integer> C = new ArrayList<>(Arrays.asList(10,12));
        Integer ans = minimize(A,B,C);
        System.out.println(ans);

    }
    public static int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<A.size() && j< B.size() && k< C.size()){
            int val1 = A.get(i)-B.get(j);
            int val2 = B.get(j)-C.get(k);
            int val3 = C.get(k)-A.get(i);
            int max = Math.max(Math.max(Math.abs(val1),Math.abs(val2)),Math.abs(val3));
            ans = Math.min(max,ans);
            if (Math.abs(val1)>Math.abs(val2)){
                if (Math.abs(val1)>Math.abs(val3)){
                    if (val1>0)j++;
                    else i++;
                }else {
                    if (val3>0)i++;
                    else k++;
                }
            }else {
                if (Math.abs(val2)>Math.abs(val3)){
                    if (val2>0)k++;
                    else j++;
                }else {
                    if (val3>0)i++;
                    else k++;
                }
            }
        }
        return ans;
    }
}
