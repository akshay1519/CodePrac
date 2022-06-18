package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;

public class AllocateBooks {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(23, 6, 13, 70, 38, 94, 20, 44, 66, 34, 26, 94, 63, 38, 44, 90, 50, 59, 23, 47, 85, 17, 72, 39, 47, 85));
        int B = 7;
        int ans = books(A,B);
        System.out.println(ans);
    }
    public static int books(ArrayList<Integer> A, int B) {
        long ansMax = 0;
        long ansMin = 0;
        long ans = 0;
        for (int i:A){
            ansMax += i;
            if (ansMin<i){
                ansMin = i;
            }
        }
        while (ansMax>=ansMin){
            long mid = ansMin + (ansMax-ansMin) /2;
            if (checkFunc(mid,A,B)){
                ans = mid;
                ansMax = mid -1;
            }else {
                ansMin = mid+1;
            }
        }
        return (int)ans;
    }

    private static boolean checkFunc(long mid, ArrayList<Integer> A, int b) {
        boolean flag = false;
        int n = A.size();
        long tempSum = 0;
        for (int i=0;i<n;i++){
            tempSum += A.get(i);
            if (tempSum > mid){
                tempSum = A.get(i);
                b--;
            }else if(tempSum == mid){
                tempSum = 0;
                if (i != n-1)
                    b--;
            }
        }
        if (b > 0){
            flag = true;
        }
        return flag;
    }
}