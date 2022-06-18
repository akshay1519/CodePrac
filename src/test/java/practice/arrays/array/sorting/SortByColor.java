package practice.arrays.array.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByColor {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(0);
        int countR=0;
        int countW=0;
        int countB=0;
        for (int i:A){
            if(i==0)
                countR++;
            if(i==1)
                countW++;
            if(i==2)
                countB++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while (i<countR){
            ans.add(0);
            i++;
        }
        i=0;
        while (i<countW){
            ans.add(1);
            i++;
        }
        i=0;
        while (i<countB){
            ans.add(2);
            i++;
        }
        System.out.println(ans);
    }
}
