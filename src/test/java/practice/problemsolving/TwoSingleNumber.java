package practice.problemsolving;

import java.util.Arrays;

public class TwoSingleNumber {
    public static void main(String[] args) {
//        int[] A = {1, 2, 3, 1, 2, 4};
//        int[] A = {186, 256, 102, 377, 186, 377};
        int[] A = {408, 478, 74, 624, 74, 204, 705, 624, 337, 408, 478, 204};
        int n = A.length;
        int ans = 0;
        int left = 0;
        int right = 0;
        for (int i=0;i<n;i++)
            ans ^= A[i];
        int j = 0,pos = 0;
        while(ans>0){
            int a = ans & 1;
            if(a == 1) {
                pos = j;
                break;
            }
            j++;
            ans = ans>>1;
        }
        for (int i=0;i<n;i++){
            if((1<<pos & A[i]) ==0){
                left ^= A[i];
            }else {
                right ^= A[i];
            }
        }
        System.out.println(ans);
        System.out.println(pos);
        int[] ansRet = {left,right};
        System.out.println(left+" "+right);
        Arrays.sort(ansRet);
    }
}
