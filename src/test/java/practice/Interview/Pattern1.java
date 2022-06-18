package practice.Interview;

import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        int n  = 10;
        List<Integer> list = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
        System.out.println(sockMerchant(n,list));

    }
    public static int sockMerchant(int n, List<Integer> ar) {
        int total = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i:ar){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        Set<Map.Entry<Integer,Integer>> mapSet = map.entrySet();
        for (Map.Entry<Integer,Integer> entry:mapSet){
            total += entry.getValue()/2;
        }
        return total;
    }
}
