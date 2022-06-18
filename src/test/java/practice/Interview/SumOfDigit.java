package practice.Interview;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        int sum = 0;
        while (n>0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
}
