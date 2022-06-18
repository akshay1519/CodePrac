package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxDistance {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(3, 5, 4, 2);
        int n = A.size();
        ArrayList<Integer> pmin = new ArrayList<>();
        ArrayList<Integer> sMax = new ArrayList<>();
        pmin.add(A.get(0));
        for (int i=1;i<n;i++){
            pmin.add(Math.min(pmin.get(i-1),A.get(i)));
        }
        sMax.add(A.get(n-1));
        int l=0;
        for (int j=n-2;j>=0;j--){
            sMax.add(Math.max(sMax.get(l++),A.get(j)));
        }
        Collections.reverse(sMax);
        int i= 0;
        int j = 0;
        int ans = 0;
        while (i<n && j<n){
            if(pmin.get(i)<=sMax.get(j)){
                ans = Math.max(j-i,ans);
                j++;
            }else {
                i++;
            }
        }
        System.out.println(ans);
        System.out.println(pmin);
        System.out.println(sMax);

    }
}
