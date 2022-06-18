package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWIthGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,100000000));
        int B = 100000000;
        ArrayList<Integer> ans = solve(A,B);
        System.out.println(ans);

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = A.size();
        int tempSum = 0;
        boolean flag = false;
        if (A.get(0) == B){
            ans.add(A.get(0));
            return ans;
        }
        while (i <n && j<=n){
            if (tempSum == B){
                flag = true;
                break;
            }
            if (tempSum<B && j != n){
                tempSum += A.get(j++);
            }else {
                tempSum -= A.get(i++);
            }
        }
        if (tempSum == B){
            flag = true;
        }
        if (flag){
            for (int k=i;k<j;k++){
                ans.add(A.get(k));
            }
        }
        return ans;
    }
}
