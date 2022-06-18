package practice.modulararithmatic.primenumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DistinctPrime {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList( 50, 25, 2, 97, 89, 13, 47, 63, 40, 9, 82, 90, 51, 96, 43, 53, 5, 13, 15, 31, 52, 59, 65, 43, 62, 74, 46, 78, 7, 61));
//        96, 98, 5, 41, 80
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(96, 98, 5, 41, 80));
        ArrayList<Integer> spf = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i:A){
            if (max<i){
                max = i;
            }
        }
        max += 1;
        for (int i=0;i<max;i++){
            spf.add(i);
        }
        for (int i=2;i*i<max;i++){
            if (spf.get(i)==i){
                for (int j=i*i;j<max;j+=i){
                    spf.set(j,i);
                }
            }
        }
        for (int i:A) {
            int ans = 1;
            while (i > 1) {
                int x = spf.get(i);
                while (i % x == 0) {
                    set.add(x);
                    i /= x;
                }
            }
        }
        System.out.println(max);
        System.out.println(spf);
        System.out.println(set);
    }
}
