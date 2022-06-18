package practice.stackandqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(Arrays.asList( "1", "2", "-2", "2", "-", "-2", "-", "+", "*" ));
        int ans = evalRPN(A);
        System.out.println(ans);

    }
    public static int evalRPN(ArrayList<String> A) {
//        Stack<Integer> st = new Stack<>();
//        for (String s:A){
//            if (!s.equals("*") && !s.equals("-") && !s.equals("/") && !s.equals("+")){
//                st.push(Integer.parseInt(s));
//            }else {
//                int a = st.pop();
//                int b = st.pop();
//                int c = 0;
//                if (s.equals("*")){
//                    c = Math.max(a,b) * Math.min(a,b);
//                }else if (s.equals("/")){
//                    if (a<0 && b<0)
//                        c = Math.min(a,b) / Math.max(a,b);
//                    else
//                        c = Math.max(a,b) / Math.min(a,b);
//                }else if (s.equals("+")){
//                    c = a + b;
//                }else {
//                    c = Math.max(a,b) - Math.min(a,b);
//                }
//                st.push(c);
//            }
//        }
//        return st.pop();
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < A.size()) {
            if(A.get(i).equals("*") || A.get(i).equals("+") || A.get(i).equals("-") || A.get(i).equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                int result = calculate(b, a, A.get(i).charAt(0));
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(A.get(i)));
            }
            i++;
        }
        return stack.pop();
    }

    private static int calculate(int a, int b, char operator) {
        switch(operator) {
            case '+':
                return a + b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '-':
                return a - b;
        }
        return -1;
    }
}
