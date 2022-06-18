package practice.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class DiffBitsSumPairWise {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,3,5));
        int n = A.size();
        long ans = 0;
        int mod = 1000000007;
        int count;
       for (int i=0;i<32;i++){
           count = 0;
           for (int e:A){
               if(((e>>i) & 1)==1){
                   count++;
               }
           }
           ans += 2L * count * (A.size()-count);
           ans %= mod;
       }
        System.out.println(ans);
        System.out.println(setBits(100000000));
    }

    private static int setBits(int A) {
        int indCount = 0;
        int mod = 1000000007;
        for (int i=1;i<=A;i++){
            for (int j=0;j<30;j++){
                if(((i>>j) & 1) == 1)
                    indCount++;
            }
            indCount %= mod;
        }
        return indCount;
    }
}
