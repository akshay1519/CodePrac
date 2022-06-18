package practice.stackandqueue;

import java.util.Stack;

public class DoubleCharacter {
    public static void main(String[] args) {
        String A = "abccbc";
        System.out.println(solve(A));

    }
    public static String solve(String A) {
        String ans = "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int n = A.length();
        for (int i=0;i<n;i++){
            if (st.isEmpty() || st.peek()!=A.charAt(i)){
                st.push(A.charAt(i));
            }else if (st.peek()==A.charAt(i)){
                st.pop();
            }
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
