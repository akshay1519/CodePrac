package practice.stackandqueue;

import java.util.Stack;

public class BalanceBracket1 {
    public static void main(String[] args) {
        String A = "{([])}";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        char[] ch = A.toCharArray();
        int n = A.length();
        Stack<Character> st = new Stack<>();
        for (int i=0;i<n;i++){
            if (st.isEmpty() || ch[i] == '{' || ch[i] == '[' || ch[i] == '('){
                st.push(ch[i]);
            }else if(st.peek()=='[' && ch[i] == ']'){
                st.pop();
            }
            else if(st.peek()=='(' && ch[i] == ')'){
                st.pop();
            }else if(st.peek()=='{' && ch[i] == '}'){
                st.pop();
            }
        }
        if (st.isEmpty()){
            return 1;
        }
        return 0;
    }
}
