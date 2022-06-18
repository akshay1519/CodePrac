package practice.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimizeDIfference {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,8,3,7,8,7,9));
        int B = 9;
        int diff = 0;
        int sum = 0;
        for (int i:A){
            sum += i;
        }
        if(B>sum){
            System.out.println(diff);
        }
        while (B>0){
            Collections.sort(A);
            A.set(A.size()-1,A.get(A.size()-1)-1);
            A.remove(new Integer(0));
            B--;
        }
        System.out.println(A);
    }
}
