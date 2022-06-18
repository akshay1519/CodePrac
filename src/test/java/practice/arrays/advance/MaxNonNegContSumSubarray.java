package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegContSumSubarray {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1967513926, 1540383426, -1303455736, -521595368);
        int n = A.size();
        long sum = 0;
        long maxSum = Integer.MIN_VALUE;
        ArrayList<Integer> eleList = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<n;i++){
            if(A.get(i)>=0) {
                sum += A.get(i);
                eleList.add(A.get(i));
                if(sum>maxSum){
                    maxSum = sum;
                    ans.clear();
                    ans.addAll(eleList);
                }else if(sum==0 && ans.size()<eleList.size()){
                    maxSum = sum;
                    ans.clear();
                    ans.addAll(eleList);
                }

            }else {
                eleList.clear();
                sum = 0;
            }
        }
        System.out.println(maxSum);
        System.out.println(ans);
    }
}
