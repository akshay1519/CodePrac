package practice.string;

import java.util.*;

public class ChangeCharacter {
    public static void main(String[] args) {
        String A = "abcabbccd";
        int B = 3;
        int n = A.length();
        int[] alpha = new int[26];
        for (int i=0;i<n;i++){
            alpha[A.charAt(i) - 97]++;
        }
        Arrays.sort(alpha);
        for (int i = 0;i<26;i++){
            if(B>=alpha[i]){
                B -= alpha[i];
                alpha[i] = 0;
            }
        }
        int count = 0;
        for (int i:alpha){
            if(i>0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
    }
}
