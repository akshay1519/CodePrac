package practice.stackandqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SortArrayUsingStack {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, 17, 100, 11));
        ArrayList<Integer> ans = solve(A);
        System.out.println(ans);
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i:A){
            if (st1.isEmpty()){
            }else if (st1.peek() >= i){
                if (st2.isEmpty()){
                    while (!st1.isEmpty() && st1.peek()>i){
                        st2.push(st1.pop());
                    }
                }
            }
            while (!st2.isEmpty() && st2.peek()<i){
                st1.push(st2.pop());
            }
            while (!st1.isEmpty() && i<st1.peek()){
                st2.push(st1.pop());
            }
            st1.push(i);
        }
        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
        while (!st2.isEmpty()){
            ans.add(st2.pop());
        }
        return ans;
    }
}
