package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AggresiveCows {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(82, 61, 38, 88, 12, 7, 6, 12, 48, 8, 31, 90, 35, 5, 88, 2, 66, 19, 5, 96, 84, 95 ));
        int B = 8;
        int ans = solve(A,B);
        System.out.println(ans);

    }
    public static int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n = A.size();
        int ansMax = A.get(n-1)-A.get(0);
        int ansMin = 1;
        int currAns = 1;
        while (ansMax>=ansMin){
            int mid = (ansMax+ansMin)/2;
            if (checkPossible(mid,A,B)){
                currAns = mid;
                ansMin = mid+1;
            }else {
                ansMax = mid-1;
            }
        }
        return currAns;
    }

    private static boolean checkPossible(int mid, ArrayList<Integer> a, int b) {
        int n = a.size();
        int k = a.get(0)+mid;
        b--;
        for (int i=1;i<n;i++){
            if (k<=a.get(i)){
                k = a.get(i)+mid;
                b--;
            }
        }
        if (b<=0){
            return true;
        }
        return false;
    }
}
