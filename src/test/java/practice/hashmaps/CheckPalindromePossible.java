package practice.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindromePossible {
    public static void main(String[] args) {
        String A = "abcde";
        char[] arr = A.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        boolean flag = false;
        int ans = 1;
        for (char ch:arr){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()%2!=0 && !flag){
                flag = true;
            }else if(entry.getValue()%2!=0 && flag){
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}
