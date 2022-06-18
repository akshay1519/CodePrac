package practice.stackandqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PassingGame {
    public static void main(String[] args) {
        int A = 10;
        int B = 38;
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList( 23, 0, 2, 0, 39, 28, 19, 0, 0, 0));
        int ans = solve(A,B,C);
        System.out.println(ans);

    }
    public static int solve(int A, int B, ArrayList<Integer> C) {
        Stack<Integer> st = new Stack<>();
        st.push(B);
        for (int i:C){
            if (!st.isEmpty() && i == 0 && A >0){
                st.pop();
            }else{
                st.push(i);
            }
        }
        return st.pop();
    }
}
