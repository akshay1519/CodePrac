package practice.sorting;

import java.util.Stack;

public class DoubleCHarTroubles {
    public static void main(String[] args) {
        String A = "abccbc";
        String ans = solve(A);
        System.out.println(ans);
    }
    public static String solve(String A) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch:A.toCharArray()){
            if (st.isEmpty()){
                st.push(ch);
            }else if (st.peek() == ch){
                st.pop();
            }else {
                st.push(ch);
            }
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
