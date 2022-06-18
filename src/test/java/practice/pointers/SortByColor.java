package practice.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class SortByColor {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0,1, 2, 0, 1, 2));
        ArrayList<Integer> ans = sortColors(A);
        System.out.println(ans);

    }
    public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int[] temp = new int[3];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i:A){
            temp[i]++;
        }
        for (int i=0;i<3;i++){
            while (temp[i]>0){
                ans.add(i);
                temp[i]--;
            }
        }
        return ans;

    }
}
