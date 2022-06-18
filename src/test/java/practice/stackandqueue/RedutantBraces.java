package practice.stackandqueue;

import java.util.Stack;

public class RedutantBraces {
    public static void main(String[] args) {
        String A = "((a+b))";
        int ans = braces(A);
        System.out.println(ans);
    }
    public static int braces(String A) {
        Stack<Character> st = new Stack<>();
        int n = A.length();
        for (int i=0;i<n;i++) {
            char ch = A.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;
            } else if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                st.push(ch);
            }  else if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                    return 1;
                }
                while (!st.empty() && st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            }
        }
        return 0;
    }
}
