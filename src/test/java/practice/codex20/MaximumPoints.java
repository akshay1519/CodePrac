package practice.codex20;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPoints {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,0,1));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(30,12,8));
        int n = A.size();
        int mSum = 0;
        int bSum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++){
            if(A.get(i)==0){
                mSum += B.get(i);
            }else {
                bSum += B.get(i);
            }
        }
        for (int i = n-1;i>=0;i--){
            if(A.get(i)==1){
                sb.append(B.get(i));
                break;
            }
        }
        if(sb.length()==0){
            sb.append('0');
        }
        sb.reverse();
        if(mSum>bSum){
            mSum += Integer.parseInt(sb.toString());
        }else {
            mSum = bSum;
        }
        System.out.println(sb);
        System.out.println(mSum);
        System.out.println(bSum);
    }
}
