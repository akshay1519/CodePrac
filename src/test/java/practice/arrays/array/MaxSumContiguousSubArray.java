package practice.arrays.array;

public class MaxSumContiguousSubArray {
    public static void main(String[] args) {
//        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] A = {-500};
        int n = A.length;
       int curSUm = 0;
       int maxSum = Integer.MIN_VALUE;
       for (int i=0;i<n;i++){
           curSUm += A[i];
           maxSum = Math.max(curSUm,maxSum);
           if(curSUm<0)
               curSUm = 0;
       }
        System.out.println(maxSum);
    }
}
