package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(9,43));
        ArrayList<Integer> ans = nextGreater(A);
        System.out.println(ans);
    }
    public static ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size()-1;
        for (int i=n;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=A.get(i)){
                st.pop();
            }
            if (st.isEmpty()){
                ans.add(-1);
            }else {
                ans.add(st.peek());
            }
            st.push(A.get(i));
        }
        int j = n;
        Collections.reverse(ans);
        return ans;
    }
}
