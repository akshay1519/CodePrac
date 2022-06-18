package practice.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(10, 5, 3, 4, 3, 5, 6);
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for (int i:A){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        for (int i:A){
            if(map.get(i)>1){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
