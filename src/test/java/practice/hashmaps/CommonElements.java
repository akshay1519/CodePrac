package practice.hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2, 1, 4, 10);
        List<Integer> B = Arrays.asList(3, 6, 2, 10, 10);
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:A){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        for (int i:B){
            if (map.containsKey(i)){
                map.put(i,map.get(i)-1);
                ans.add(i);
                if (map.get(i)==0){
                    map.remove(i);
                }
            }
        }
        System.out.println(ans);
    }
}
