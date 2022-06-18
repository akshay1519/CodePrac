package practice.stackandqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AllSubArrays {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 1, 4));
        int ans = solve(A);
        System.out.println(ans);
    }
    public static int solve(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i:A) {
            if (st.isEmpty()) {
                st.push(i);
            }else {
                while (!st.isEmpty() && st.peek()<=i) {
                    max = Math.max(max,st.pop()^i);
                }
                if (!st.isEmpty()) {
                    max = Math.max(max,st.peek()^i);

                }
        st.push(i);
            }
        }
//        Stack<Integer> stack = new Stack<Integer>();
//        int max = 0;
//        for(int i=0; i<A.size(); i++)
//        {
//            if(stack.isEmpty())
//            {
//                stack.push(A[0]);
//            }
//            else
//            {
//                while(!stack.isEmpty() && stack.peek()<=A.get(i))
//                {
//                    max = Math.max(max, stack.peek()^A.get(i));
//                    stack.pop();
//                }
//                if( !stack.isEmpty() )
//                    max = Math.max(max, stack.peek()^A.get(i));
//
//                stack.push(A.get(i));
//            }
//        }
        return max;
    }
}
