package practice.string;

import java.util.HashMap;
import java.util.Map;

public class WindowString {
    public static void main(String[] args) {
        String A = "DAOBECODEBANC";
        String B = "ABC";
        String ans = minWindow(A,B);
        System.out.println(ans);
    }
    public static String minWindow(String A, String B) {
        Map<Character,Integer> map = new HashMap<>();
        int count = B.length();
        String ans = "";
        for (char ch:B.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int min_len = -1;
        int index = -1;
        int start = 0;
        int end = 0;
        while (end<A.length()) {
            char ch = A.charAt(end);
            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    count--;
                }
                map.put(ch, map.get(ch) - 1);
            }
            while (count == 0) {

                int len = end - start + 1;
                if (index == -1 || min_len >= len) {
                    min_len = len;
                    index = start;
                }
                char ch1 = A.charAt(start);
                if (map.containsKey(ch1)) {
                    if (map.get(ch1) >= 0) {
                        count++;
                    }
                        map.put(ch1, map.get(ch1) + 1);
                    }
                    start++;
                }
                end++;
            }
        if (index != -1){
            ans = A.substring(index,index+min_len);
        }
        return ans;
    }
}
