package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class CountPairWithGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int ans = solve(A,5);
        System.out.println(ans);
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int i = 0;
        int j = A.size()-1;
        long ans = 0;
        while(i<j){
            int val = A.get(i)+A.get(j);
            if(val == B){
                ans++;
                i++;
                j--;
            }else if(val<B){
                i++;
            }else{
                j--;
            }
        }
        return (int)ans;
    }
}
