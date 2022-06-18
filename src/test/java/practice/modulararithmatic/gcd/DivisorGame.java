package practice.modulararithmatic.gcd;

public class DivisorGame {
    public static void main(String[] args) {
        int A = 12;
        int B = 3;
        int C = 2;
        System.out.println(ans(A,B,C));
    }
    public static int ans(int a,int b,int c){
        int lcm = (b * c)/gcd(b,c);
        int ans = a/lcm;
        return ans;
    }
    public static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
