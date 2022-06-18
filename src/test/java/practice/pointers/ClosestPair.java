package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPair {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
//        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, 10, 20));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,2,30));
        int C = 13;
        ArrayList<Integer> ans = solve(A,B,C);
        System.out.println(ans);
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = B.size()-1;
        int diff = Integer.MAX_VALUE;
        int prevIInd = A.size();
        int prevJInd = B.size();
        while (i<A.size() && j>-1){
            int sum = A.get(i)+B.get(j);
            int currDiff = Math.abs(sum-C);
            if (currDiff<diff){
                diff = currDiff;
                ans.clear();
                ans.add(A.get(i));
                ans.add(B.get(j));
                prevIInd = i;
                prevJInd = j;
            }else if(currDiff==diff && prevIInd>=i && prevJInd>=j){
                ans.clear();
                ans.add(A.get(i));
                ans.add(B.get(j));
                prevIInd = i;
                prevJInd = j;
            }
            if (sum == C){
                ans.clear();
                ans.add(A.get(i));
                ans.add(B.get(j));
                break;
            }else if (sum > C){
                j--;
            }else {
                i++;
            }
        }
        return ans;
    }
}
