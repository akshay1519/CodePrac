package practice.stackandqueue;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String A = "))))))";
        Stack<Character> brackets = new Stack<>();
        for (char ch:A.toCharArray()){
            if(ch=='{' || ch =='(' || ch =='[')
                brackets.push(ch);
            else if(!brackets.isEmpty() && brackets.peek().equals('{') && ch == '}' )
                brackets.pop();
            else if(!brackets.isEmpty() && brackets.peek().equals('[') && ch == ']' )
                brackets.pop();
            else if(!brackets.isEmpty() && brackets.peek().equals('(') && ch == ')')
                brackets.pop();
            else
                return;
        }
        if(!brackets.isEmpty())
            return;
        return;
    }
}
