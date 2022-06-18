package practice.arrays.subsqeqandsubset;

import java.util.Arrays;
import java.util.List;

public class OddEvenSubSeq {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2,2,2,2,2);
        int n = A.size();
        int fEvenIndex = 0;
        int fOddIndex = 0;
        int oddCount = 0;
        int evenCount = 0;
        boolean flag = false;
        for (int i=0;i<n;i++){
            if(A.get(i)%2==0) {
                fEvenIndex = i;
                break;
            }
        }
        for (int i=0;i<n;i++){
            if(A.get(i)%2!=0) {
                fOddIndex = i;
                break;
            }
        }
        for (int i=fEvenIndex;i<n;i++){
            if(!flag && A.get(i)%2==0){
                flag = true;
                evenCount++;
            }else if(flag && A.get(i)%2!=0){
                flag = false;
                evenCount++;
            }
        }
        flag = false;
        for (int i=fOddIndex;i<n;i++){
            if(!flag && A.get(i)%2!=0){
                flag = true;
                oddCount++;
            }else if(flag && A.get(i)%2==0){
                flag = false;
                oddCount++;
            }
        }
        System.out.println(Math.max(evenCount,oddCount));
    }
}
