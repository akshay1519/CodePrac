package practice.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumber {
    public static void main(String[] args) {
        int A = 7;
        String ans = solve(A);
        System.out.println(ans);

    }
    public static String solve(int A) {
        int count = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        while (count<=A && !queue.isEmpty()){
            String str = queue.poll();
            count++;
            if (count==A){
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                int i = str.length()-1;
                while (i>=0){
                    sb.append(str.charAt(i));
                    i--;
                }
                return sb.toString();
            }
            queue.add(str+"1");
            queue.add(str+"2");
        }
        return "";

    }
}
