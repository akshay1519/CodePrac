package practice.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KOccurance {
    public static void main(String[] args) {
        int A = 3;
        int B = 2;
        List<Integer> C = Arrays.asList(1,2,3,4,5);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:C){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int ans = 0;
        boolean flag = false;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==B){
                ans += entry.getKey() % (Math.pow(10,9)+7);
                flag = true;
            }
        }
        if(!flag){
            ans =  -1;
        }
        System.out.println(ans);
    }
}
