package practice.pointers;

import java.util.*;

public class ThreeSUmZero {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3));
        ArrayList<ArrayList<Integer>> ans = threeSum(A);
        System.out.println(ans);
    }
    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(A);
        for (int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            while (j<k){
                int sum = A.get(j)+A.get(k);
                if (sum == -A.get(i)){
                    ArrayList<Integer> currAns = new ArrayList<>();
                    currAns.add(A.get(i));
                    currAns.add(A.get(j));
                    currAns.add(A.get(k));
                    ans.add(currAns);
                    j++;
                    k--;
                }else if(sum > 0){
                    k--;
                }else {
                    j++;
                }
            }
        }
        Set<ArrayList<Integer>> set = new LinkedHashSet<ArrayList<Integer>>();
        set.addAll(ans);
        ans.clear();
        ans.addAll(set);
        return ans;
    }
}
