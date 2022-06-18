package practice.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Contains123 {
    public static void main(String[] args) {
        int A = 7;
        ArrayList<Integer> ans = solve(A);
        System.out.println(ans);

    }
    public static ArrayList<Integer> solve(int A) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        ArrayList<Integer> ans = new ArrayList<>();
        while (ans.size()<A){
            int temp = queue.poll();
            ans.add(temp);
            queue.add(temp*10+1);
            queue.add(temp*10+2);
            queue.add(temp*10+3);
        }
        return ans;
    }
}
