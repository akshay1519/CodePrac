package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RainWater {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList( 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 );
        int n = A.size();
        List<Integer> lMax = new ArrayList<>();
        List<Integer> rMax = new ArrayList<>();
        lMax.add(A.get(0));
        rMax.add(A.get(n-1));
        int ans = 0;
        for(int i=1;i<n;i++){
            lMax.add(lMax.get(i-1)<A.get(i)?A.get(i):(lMax.get(i-1)));
        }
        int j = 1;
        for(int i=n-2;i>=0;i--){
            rMax.add(rMax.get(j-1)<A.get(i)?A.get(i):(rMax.get(j-1)));
            j++;
        }
        for(int i=0;i<n;i++){
            ans += Math.min(lMax.get(i),rMax.get(n-1-i))-A.get(i);
        }
        System.out.println();
        System.out.println(ans);
    }
}
