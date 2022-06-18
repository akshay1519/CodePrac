package practice.arrays.advance;

import java.util.Arrays;
import java.util.List;

public class FirstMissingInteger {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1,2,3,-2);
        int ans = 0;
        int n = A.size();
        for (int i=0;i<n;i++){
            if (A.get(i)<=0){
                A.set(i, n + 1);
            }
        }
        for (int i=0;i<n;i++){
            if (Math.abs(A.get(i))<=n){
                int index = Math.abs(A.get(i))-1;
                A.set(index,-1*Math.abs(A.get(index)));
            }
        }
        for (int i=1;i<=n;i++){
            if(A.get(i-1)>0){
                ans = i;
                break;
            }
        }
        if (ans==0){
            ans = A.size()+1;
        }
        System.out.println("#####"+ans);
    }
}
