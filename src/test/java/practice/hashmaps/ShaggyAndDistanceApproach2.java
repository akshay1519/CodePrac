package practice.hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ShaggyAndDistanceApproach2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(7, 1, 3, 4, 1, 7));
        int ans = solve(A);
        System.out.println(ans);
    }
    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (map.containsKey(A.get(i))){
                ans = Math.min(ans,i-map.get(A.get(i)));
                map.put(A.get(i),i);
            }else {
                map.put(A.get(i),i);
            }
        }
        if (ans == Integer.MAX_VALUE){
            ans = -1;
        }
        return ans;
    }

}
