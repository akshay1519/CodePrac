package practice.stackandqueue;


import java.util.Arrays;
import java.util.Stack;

public class TwoBracketExpression {
    public static void main(String[] args) {
        String A = "(a+b-c-d+e-f+g+h+i)";
        String B = "a+b-c-d+e-f+g+h+i";
        int ans = solve(A,B);
        System.out.println(ans);
    }
    public static int solve(String A, String B) {
        if (Arrays.equals(evaluation(A),(evaluation(B))))
            return 1;
        return 0;

    }
    public static int[] evaluation(String A){
        Stack<Boolean> st = new Stack<>();
        st.push(true);
        boolean global = true;
        int i = 0;
        int[] ans = new int[26];
        while (i<A.length()){
            if (A.charAt(i)=='+' || A.charAt(i)=='-'){
                i++;
                continue;
            }
            if (A.charAt(i) == '(' && i>0){
                if (A.charAt(i-1) == '-'){
                    st.push(!st.peek());
                }else if (A.charAt(i-1) == '+'){
                    st.push(st.peek());
                }
                i++;
                continue;
            }
            if (A.charAt(i)>='a' && A.charAt(i)<='z'){
               if (i>0 && A.charAt(i-1)=='-'){
                    ans[A.charAt(i)-'a'] = st.peek()?-1:1;
               }else {
                   ans[A.charAt(i)-'a'] = st.peek()?1:-1;
               }
                i++;
               continue;
            }
            if (A.charAt(i) == ')'){
                i++;
                st.pop();
                continue;
            }
            i++;
        }
        return ans;
    }
}
