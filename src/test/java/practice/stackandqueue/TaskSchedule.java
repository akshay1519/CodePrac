package practice.stackandqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TaskSchedule {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 1, 5, 4));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        int ans = solve(A,B);
        System.out.println(ans);

    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Queue<Integer> queue = new LinkedList<>(A);
        int ans = 0;
        for (int i:B) {
            while (!queue.isEmpty() && queue.peek()!=i) {
                queue.add(queue.poll());
                ans++;
            }
            queue.poll();
            ans++;
        }
        return ans;
    }
}
