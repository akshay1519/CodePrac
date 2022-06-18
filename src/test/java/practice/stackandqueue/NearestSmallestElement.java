package practice.stackandqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(39, 27, 11, 4, 24, 32, 32, 1));
        ArrayList<Integer> ans = prevSmaller(A);
        System.out.println(ans);
    }
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n = A.size();
        for (int i=0;i<n;i++){
            if (st.isEmpty()){
                st.push(A.get(i));
                ans.add(-1);
            }else {
                while (!st.isEmpty() && st.peek() >= A.get(i)) {
                    st.pop();
                }
                if (st.isEmpty()){
                    ans.add(-1);
                }else {
                    ans.add(st.peek());
                }
                st.push(A.get(i));
            }
        }
        return ans;
    }
}
