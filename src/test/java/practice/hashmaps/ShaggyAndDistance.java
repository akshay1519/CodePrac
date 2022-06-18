package practice.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShaggyAndDistance {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1,2,3,4,9,5,2);
        HashMap<Integer,Integer> map = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i:A){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        map.entrySet().removeIf(e -> e.getValue().equals(1));
        if(map.size()==0){
            return;
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            int s = -1;
            for (int i=0;i<A.size();i++){
                if (s == -1 && entry.getKey().equals(A.get(i))){
                    s = i;
                }else if(entry.getKey().equals(A.get(i))){
                    minDiff = Math.min(i-s,minDiff);
                    s = i;
                }
            }
        }
        System.out.println(minDiff);
        System.out.println(map);
    }
}
