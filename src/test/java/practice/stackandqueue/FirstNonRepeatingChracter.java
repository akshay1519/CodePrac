package practice.stackandqueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChracter {
    public static void main(String[] args) {
        String A = "abcabc";
        String ans = solve(A);
        System.out.println(ans);

    }
    public static String solve(String A) {
        Queue<Character> queue = new LinkedList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char ch:A.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
            queue.add(ch);
            while (!queue.isEmpty() && map.get(queue.peek())>1){
                queue.poll();
            }
            if (queue.isEmpty()){
                sb.append('#');
            }else {
                sb.append(queue.peek());
            }
        }
        return sb.toString();
    }
}
