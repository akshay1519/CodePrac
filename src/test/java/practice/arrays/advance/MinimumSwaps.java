package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList( 52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70));
        int B = 19;
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,12,10,3,14,10,5));
//        int B = 8;
        int n = A.size();
        int count = 0;
        for (int i:A){
            if(i<=B)
                count++;
        }
        int tempcount = 0;
        for (int i=0;i<count;i++){
            if(A.get(i)<=B)
                tempcount++;
        }
        int i=1;
        int j = count;
        int wincnt = tempcount;
        int ans = count-tempcount;
        while (j<n){
             if(A.get(i-1)<=B){
                 wincnt--;
             }
             if (A.get(j)<=B){
                 wincnt++;
             }
             ans = Math.min(ans,count-wincnt);
             i++;
             j++;
        }
        System.out.println(ans);
        System.out.println(wincnt);
        System.out.println(tempcount);

        System.out.println(count);
    }
}
