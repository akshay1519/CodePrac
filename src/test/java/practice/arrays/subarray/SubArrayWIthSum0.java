package practice.arrays.subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayWIthSum0 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,-1));
        Map<Long,Long> map = new HashMap<>();
        long sum = 0;
        int ans = 0;
        map.put(0L,1L);
        for (int i:A){
            sum += i;
            if (map.containsKey(sum)){
                ans = 1;
                break;
            }else {
                map.put(sum,1L);
            }
        }
//        for (Map.Entry<Integer,Integer> m:map.entrySet()){
//            if (m.getValue()>1){
//                ans = 1;
//            }else if (m.getKey()==0){
//                ans = 1;
//            }
//        }
        System.out.println(ans);
    }
}
