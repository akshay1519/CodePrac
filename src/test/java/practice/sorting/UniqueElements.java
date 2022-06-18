package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 3));
        int n = A.size();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = A.get(i);
        }
        Arrays.sort(arr);
        int start = A.get(0);
        int count = 0;
        for (int i=1;i<n;i++){
            if(arr[i]<=arr[i-1]) {
                int i1 = arr[i - 1] - arr[i];
                count+= i1 +1;
                arr[i]+=i1+1;
            }
        }
        System.out.println(A);
        System.out.println(count);
    }
}
