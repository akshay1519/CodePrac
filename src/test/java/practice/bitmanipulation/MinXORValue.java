package practice.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinXORValue {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 2, 5, 7));
        int n = A.size();
        int min = Integer.MAX_VALUE;
        Collections.sort(A);
        for (int i=0;i<n-1;i++){
            int val = A.get(i)^A.get(i+1);
            if (min>val)
                min = val;
        }
        System.out.println(min);
    }
}
