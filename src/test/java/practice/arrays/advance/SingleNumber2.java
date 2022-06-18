package practice.arrays.advance;

import java.util.*;

public class SingleNumber2 {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:A){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
           if(entry.getValue()==1)
               ans = entry.getKey();
        }
        System.out.println(ans);
    }
}
