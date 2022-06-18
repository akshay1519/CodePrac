package practice.modulararithmatic.gcd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeleteOne {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(21, 7, 3, 42, 63);
        int n = A.size();
        ArrayList<Integer> prefixGCD = new ArrayList<>();
        ArrayList<Integer> suffixGCD = new ArrayList<>();
        int curr = A.get(0);
        for (int i:A){
            curr = gcd(curr,i);
            prefixGCD.add(curr);
        }
        curr = A.get(A.size()-1);
        for (int j = A.size()-1;j>=0;j--){
            curr = gcd(A.get(j),curr);
            suffixGCD.add(curr);
        }
        Collections.reverse(suffixGCD);
        int maxGCD = 1;
        for (int i=0;i<n;i++){
            int currMaxGCd = 1;
            if(i==0){
                currMaxGCd = suffixGCD.get(i+1);
            }else if(i==n-1){
                currMaxGCd = prefixGCD.get(i-1);
            }else {
                currMaxGCd = gcd(prefixGCD.get(i-1),suffixGCD.get(i+1));
            }
            maxGCD = Math.max(currMaxGCd,maxGCD);
        }

        System.out.println(maxGCD);


        System.out.println("Prefix " + prefixGCD);
        System.out.println("suffix " + suffixGCD);
    }
    public static int gcd(int A, int B) {
        if(A==0)
            return B;
        return gcd(B%A,A);
    }
}
