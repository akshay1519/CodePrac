package practice.stackandqueue;

import java.util.Stack;

public class BalanceBrackets {
    public static void main(String[] args) {
        String A = ")((";
        int n = A.length();
        Stack<Character> st = new Stack<>();
        int ans = 1;
        for (int i = 0;i<n;i++){
            if(A.charAt(i)=='('){
                st.push('(');
            }else if(!st.empty() && A.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }else {
                ans = 0;
                break;
            }
        }
        if(!st.empty()){
            ans = 0;
        }
        System.out.println(ans);
    }
}
