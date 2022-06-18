package practice.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithouRepeat {
    public static void main(String[] args) {
        String A = "abc1Abdaca";
        int ans = lengthOfLongestSubstring(A);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String A) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        int start = 0;
        for (int i = 0; i < A.length(); i++) {
            while (set.contains(A.charAt(i))) {
                set.remove(A.charAt(start++));
            }
            set.add(A.charAt(i));
            if (ans < set.size()) {
                ans = set.size();
            }
        }
        return ans;
    }
}
