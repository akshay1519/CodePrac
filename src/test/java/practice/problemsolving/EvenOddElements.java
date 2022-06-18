package practice.problemsolving;

import java.util.Scanner;

public class EvenOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] input = new int[n];
            int evenCount = 0;
            int oddCount = 0;
            for (int i=0;i<n;i++){
                input[i] = sc.nextInt();
                if(input[i]!=0) {
                    if (input[i] % 2 == 0)
                        evenCount++;
                    else
                        oddCount++;
                }
            }
            int ans = Math.abs(evenCount-oddCount);
            System.out.println(ans);
        }
    }
}
