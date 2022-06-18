package practice.stackandqueue;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
       String A = "x/(b+t)*g*(h-o)^s/(e-z)";
       String ans = solve(A);
        System.out.println(ans);
    }
    public static String solve(String A) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch:A.toCharArray()){
            if (ch>='a' && ch <='z'){
                sb.append(ch);
            }else if (ch=='('){
                st.push(ch);
            }else if (ch==')'){
                while (st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
            }else if (ch == '^'){
                while (!st.isEmpty() && (st.peek()=='^')){
                    sb.append(st.pop());
                }
                st.push(ch);
            }else if (ch == '*' || ch == '/'){
                while (!st.isEmpty() && (st.peek()=='^' || st.peek()=='*' || st.peek()=='/')){
                    sb.append(st.pop());
                }
                st.push(ch);
            }else if (ch == '+' || ch == '-'){
                while (!st.isEmpty() && (st.peek()=='^' || st.peek()=='*' || st.peek()=='/' || st.peek()=='+' || st.peek()=='-')){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
