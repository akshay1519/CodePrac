package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class UnSortedSubArray {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 15, 4, 4, 15, 18, 20));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 8, 9, 11, 9, 11, 12, 12, 11, 9, 14, 19, 20, 20 ));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 2, 3));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 3, 4, 5, 5, 9, 11, 13, 14, 15, 15, 16, 15, 20, 16));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList( 1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15 ));
        int n = A.size();
        int lInd = -1;
        int rInd = -1;
        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag = true;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i=0;i<n-1;i++){
            temp.add(A.get(i));
            if (A.get(i)>A.get(i+1)){
                flag = false;
            }
        }
        temp.add(A.get(n-1));
        Collections.sort(temp);
        for (int i=0;i<n;i++){
            if (!Objects.equals(A.get(i), temp.get(i))){
                if (lInd == -1)
                    lInd = i;
                else
                    rInd = i;
            }
        }
        for (int i=n-1;i>=0;i--){
            if (!Objects.equals(A.get(i), temp.get(i))){
                rInd = i;
                break;
            }
        }
        if (flag){
            ans.add(-1);
        }else {
            ans.add(lInd);
            ans.add(rInd);
        }
        System.out.println(A);
        System.out.println(temp);
        System.out.println(lInd);
        System.out.println(rInd);
        System.out.println(ans);
    }
}
