package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PairsWithGivenDiff {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2));
        int B = 0;
        int N = A.size();
        int count=0,  i=0, j=1;
        Collections.sort(A);
        int p2 = -1, p1 = -1;
        while(j<N){
            int diff = Math.abs(A.get(j) - A.get(i));
            if(diff == B){
                if(p1 != A.get(j) && p2 != A.get(i)){
                    count++;
                    p1 = A.get(j);
                    p2 = A.get(i);
                }

                i++;
                j++;
            }else if(diff > B){
                i++;
                if(i==j){
                    j++;
                }
            }else{
                j++;
            }
        }
        System.out.println(count);
    }
}
