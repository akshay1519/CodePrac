package practice.arrays.subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubArrayWIthGivenSum {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 1000000000);
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int B = 1000000000;
        int i = 0,j = 0;
        int sum = 0;
        for (int l:A){
            set.add(l);
        }
        while (i<n && j<n) {
            if (sum == B) {
                break;
            } else if (sum < B) {
                sum += A.get(j++);
            } else {
                sum -= A.get(i++);
            }
        }
        if(sum == B){
            for (int k=i;k<j;k++){
                ans.add(A.get(k));
            }
        }else if(set.contains(B)){
            ans.add(B);
        }else {
            ans.add(-1);
        }
        System.out.println(ans);
    }
}
