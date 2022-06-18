package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));
        int n = A.size();
        int count = 0;
        for (int i=0;i<n;i++){
            while (A.get(i)!=i){
                int temp1 = A.get(i);
                int temp2 = A.get(temp1-1);
                A.set(temp1-1,temp1);
                A.set(i,temp2);
                count++;
            }
        }
        System.out.println(A);
    }
}
