package practice.hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DistNoInWindow {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3));
        int B = 3;
        ArrayList<Integer> ans = dNums(A,B);
        System.out.println(ans);
    }
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();
        for (int i=0;i<B;i++){
            if (map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
            }else {
                map.put(A.get(i),1);
            }
        }
        int j = 0;
        ans.add(map.size());
        for (int i=B;i<n;i++){
            if (map.get(A.get(j))==1){
                map.remove(A.get(j));
            }else {
                map.put(A.get(j),map.get(A.get(j))-1);
            }
            if (map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
            }else {
                map.put(A.get(i),1);
            }
            j++;
            ans.add(map.size());
        }
        return ans;
    }
}
