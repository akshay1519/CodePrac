package practice.modulararithmatic.primenumbers;

import java.util.ArrayList;

public class PrimeSum {
    public static void main(String[] args) {
        int A = 16777214;
        boolean[] spf = new boolean[A+1];
        ArrayList<Integer> ans = new ArrayList<>();
        int max = A+1;
        for (int j=0;j<max;j++){
            spf[j]=true;
        }
        for (int i=2;i*i<=max;i++){
            if (spf[i]){
                for (int j = i*i;j<max;j+=i){
                    spf[j] = false;
                }
            }
        }
        for (int i=2;i<max;i++){
            if(spf[i] && spf[A-i]){
                ans.add(i);
                ans.add(A-i);
                break;
            }
        }
        System.out.println(ans);
    }
}
