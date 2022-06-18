package practice.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class LongestSubSTringWIthouRepeat {
    public static void main(String[] args) {
        String A = "AaaA";
        int ans = lengthOfLongestSubstring(A);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String A) {
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int i = 0;
        for (char ch:A.toCharArray()){
            if (map.containsKey(ch)){
                while (map.containsKey(ch)){
                    map.remove(A.charAt(i++));
                }
                map.put(ch,1);
            }else {
                map.put(ch,1);
            }
            if (map.size()>ans){
                ans = map.size();
            }
        }
        return ans;

    }
}
