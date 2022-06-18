package practice.arrays.array;

import java.util.ArrayList;
import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0;i<n;i++){
            input[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        B %= n;
        System.out.println(B);
        for (int i = n-B;i<n;i++){
            ans.add(input[i]);
        }
        for (int i = 0;i<n-B;i++){
            ans.add(input[i]);
        }
        for (int i:ans){
            System.out.print(i+" ");
        }
    }
}
