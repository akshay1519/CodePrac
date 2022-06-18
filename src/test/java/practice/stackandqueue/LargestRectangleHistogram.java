package practice.stackandqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3));
        int ans = largestRectangleArea(A);
        System.out.println(ans);
    }
    public static int largestRectangleArea(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        st.push(0);
        for (int i=1;i<A.size();i++){
            if (A.get(i)>=A.get(st.peek())){
                st.push(i);
            }else {
                while (!st.isEmpty() && A.get(i)<A.get(st.peek())){
                    int index = st.pop();
                    if (st.isEmpty()){
                        maxArea = Math.max(maxArea,i*A.get(index));
                    }else {
                        maxArea = Math.max(maxArea,(i-st.peek()-1)*A.get(index));
                    }
                }
                st.push(i);
            }
        }
        while (!st.isEmpty()){
            int index = st.pop();
            if (st.isEmpty()){
                maxArea = Math.max(maxArea,A.size()*A.get(index));
            }else {
                maxArea = Math.max(maxArea,(A.size()-st.peek()-1)*A.get(index));
            }
        }
        return maxArea;

//        Stack<Integer> stack = new Stack<Integer>();
//        stack.push(0);
//        int max_area = 0;
//
//        for(int i=1; i<A.size(); i++)
//        {
//            if(A.get(i) >= A.get(stack.peek()))
//                stack.push(i);
//            else
//            {
//                while( !stack.isEmpty() && A.get(i) < A.get(stack.peek()))
//                {
//                    int index = stack.peek();
//                    stack.pop();
//
//                    if( stack.isEmpty() )
//                        max_area = Math.max(max_area, i*A.get(index));
//                    else
//                        max_area = Math.max(max_area, (i-stack.peek()-1)*A.get(index) );
//                }
//                stack.push(i);
//            }
//        }
//
//        while( !stack.isEmpty() )
//        {
//            int index = stack.peek();
//            stack.pop();
//
//            if( stack.isEmpty() )
//                max_area = Math.max(max_area, A.size()*A.get(index));
//            else
//                max_area = Math.max(max_area, (A.size()-stack.peek()-1)*A.get(index) );
//        }
//
//        return max_area;

    }
}
