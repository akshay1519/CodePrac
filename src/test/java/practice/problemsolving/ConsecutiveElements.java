package practice.problemsolving;

import java.util.Arrays;

public class ConsecutiveElements {
    public static void main(String[] args) {
        int[] A = {2, 1, 4, 5};
        int n = A.length;
        boolean flag = false;
//        for (int i=0;i<n;i++){
//            int minVal = Integer.MAX_VALUE;
//            int index = 0;
//            for (int j=i;j<n;j++){
//                if(minVal>A[j]) {
//                    minVal = A[j];
//                    index = j;
//                }
//            }
//            int temp = A[i];
//            A[i] = A[index];
//            A[index] = temp;
//        }
        Arrays.sort(A);
        for (int i=0;i<n-1;i++){
            if(A[i+1]-A[i]!=1) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }

}
