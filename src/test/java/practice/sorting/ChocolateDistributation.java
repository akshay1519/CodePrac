package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributation {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        int B = 5;
        System.out.println(solve(A,B));

    }
    public static int solve(ArrayList<Integer> A,int B){
        int n = A.size();
        Collections.sort(A);
        int minDiff = Integer.MAX_VALUE;
        if (n==0 || B==0){
            return 0;
        }
        if (n<B){
            return  -1;
        }
        for (int i=0;i+B-1<n;i++){
            if(A.get(i+B-1)-A.get(i) <minDiff){
                minDiff = A.get(i+B-1)-A.get(i);
            }
        }
        return minDiff;
    }
}
