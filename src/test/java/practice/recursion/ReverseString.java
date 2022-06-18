package practice.recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length()-1;
        reverse(S,n);
        System.out.println();
    }
    public static void reverse(String S,int i){
        if(i==-1){
            return;
        }
        System.out.print(S.charAt(i));
        reverse(S,i-1);
    }
}
