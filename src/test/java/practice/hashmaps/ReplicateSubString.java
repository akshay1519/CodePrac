package practice.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class ReplicateSubString {
    public static void main(String[] args) {
        int A = 2;
        String B = "bbaabb";
        int ans = solve(A,B);
        System.out.println(ans);
    }
    public static int solve(int A, String B) {
        char[] ch = B.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<B.length();i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()%A != 0){
                return -1;
            }
        }
        return 1;
    }
}
