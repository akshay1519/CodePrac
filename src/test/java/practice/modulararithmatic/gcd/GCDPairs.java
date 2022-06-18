package practice.modulararithmatic.gcd;

import java.util.ArrayList;
import java.util.Arrays;

public class GCDPairs {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 8, 2, 2, 2, 10));
        int n = A.size();
        int interval = (int) Math.sqrt(n);
        ArrayList<Integer> res = new ArrayList<>();
        int max = 0;
        int count = 0;
        for (int i=0;i<n;i++){
            if (A.get(i)>max)
                max = A.get(i);
            count++;
            if (count==interval){
                res.add(max);
                max = 0;
                count = 0;
            }
        }
        System.out.println(res);
    }
}
