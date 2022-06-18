package practice.arrays.advance;

import java.util.Arrays;
import java.util.List;

public class MaxContSumSubarray {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(-5,1, 2,-1, 3, 4, -10);
        int n = A.size();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            sum += A.get(i);
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
