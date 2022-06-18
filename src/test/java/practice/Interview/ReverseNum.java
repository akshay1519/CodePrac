package practice.Interview;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(reverse(m));
    }

    private static int reverse(int m) {
        int rev = 0;
        while (m>0){
            rev = rev*10+(m%10);
            m /= 10;
        }
        return rev;
    }
}
