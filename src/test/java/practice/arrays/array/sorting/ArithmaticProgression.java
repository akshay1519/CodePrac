package practice.arrays.array.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArithmaticProgression {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(5);
        A.add(1);
        Collections.sort(A);
        int n = A.size();
        int ans = 1;
        int diff = 0;
        if(A.size()>1) {
            diff = A.get(1) - A.get(0);
            for (int j=0;j<n-1;j++){
                if (A.get(j+1)-A.get(j)!=diff) {
                    ans = 0;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
