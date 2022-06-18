package practice.problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumProblem {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(5,4,2);
        int B = 6;
        int n = A.size();
        Collections.sort(A);
        int ans = 0;
        for (int i=1;i<Math.pow(2,n);i++){
            int sum = 0;
            for (int j=0;j<n;j++){;
                boolean currBit =  i << ~j <0;
                if(currBit){
                    sum += A.get(j);
                }
            }
            if(sum == B){
                ans = 1;
            }
        }
        System.out.println(ans);
    }
}
