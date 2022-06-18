package practice.arrays.array;

import java.util.ArrayList;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] A = {5, 2, 3};
        int n = A.length;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(A[n - 1]);
        int rMax = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (rMax < A[i]) {
                rMax = A[i];
                temp.add(rMax);
            }
        }
        int[] ans = new int[temp.size()];
        int j = 0;
        for (int i:temp){
            ans[j++] = i;
        }
        System.out.println(temp);
    }
}
