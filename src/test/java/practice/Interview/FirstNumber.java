package practice.Interview;

import java.util.Scanner;

public class FirstNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int m = sc.nextInt();
            System.out.println(findFirstDigit(m));
        }
    }
    public static int findFirstDigit(int a){
        int first = 0;
        while (a>9){
            a /=10;
        }
        return a;
    }
}
