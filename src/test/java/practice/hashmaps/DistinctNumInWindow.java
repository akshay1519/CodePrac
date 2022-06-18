package practice.hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DistinctNumInWindow {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97);
        int B = 8;
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap();
        if(B==1){
            for (int i=0;i<n;i++){
                ans.add(1);
            }
        }else if(B>n){
            return;
        }else {
            for (int i = 0; i < B; i++) {
                if (map.containsKey(A.get(i))) {
                    map.put(A.get(i), map.get(A.get(i)) + 1);
                } else {
                    map.put(A.get(i), 1);
                }
            }
            ans.add(map.size());
            int j = B;
            for (int i = 0; i < n - B; i++) {
                if (map.get(A.get(i)) > 1) {
                    map.put(A.get(i), map.get(A.get(i)) - 1);
                } else {
                    map.remove(A.get(i));
                }
                if (map.containsKey(A.get(j))) {
                    map.put(A.get(j), map.get(A.get(j)) + 1);
                } else {
                    map.put(A.get(j), 1);
                }
                j++;
                ans.add(map.size());
            }
            System.out.println(ans);
        }
    }
}
