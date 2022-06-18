package practice.codex20;

public class DivBy30 {
    public static void main(String[] args) {
        String A = "52514252632145211456632214552212123332211144522114411222";
        int n = A.length();
        int carry = 0;
        int i = 0;
        while (i < n-1){
            int val = carry*10 + A.charAt(i)-'0';
            i++;
            carry = val % 30;
        }
        System.out.println(carry);
    }
}
