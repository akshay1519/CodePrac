package practice.modulararithmatic;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSumDivByM {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        int B = 2;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList( 93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83, 82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49));
        int B = 37;
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, 17, 100, 11));
//        int B = 28;
        int n = A.size();
        int mod = (int) Math.pow(10,9)+7;
        long ansCount = 0;
        int[] dataArr = new int[B];
        for (int i=0;i<n;i++){
            dataArr[A.get(i)%B]++;
        }
        ansCount = ((long) dataArr[0] *(dataArr[0]-1))/2;
        ansCount %= mod;
        int i = 1;
        int j = B-1;
        while (i<=j){
            if (i == j){
                ansCount += ((long) dataArr[i] * (dataArr[i]-1)) / 2;
                ansCount %= mod;
            }else {
                ansCount += ((long) dataArr[i] * dataArr[j]);
                ansCount %= mod;
            }
            i++;
            j--;
        }
        System.out.println();
        System.out.println(ansCount);
    }
}
