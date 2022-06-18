package practice.arrays.array.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemoval {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Collections.addAll(A,5);
        Collections.sort(A);
        int sum = 0;
        int n = A.size();
        int j =1;
        for (int i=n-1;i>=0;i--){
            sum += A.get(i)*(j++);
        }
        System.out.println(sum);
    }
}
