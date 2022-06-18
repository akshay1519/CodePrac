package practice.arrays.subarray;

public class LCM {
    public static void main(String[] args) {
        int A = 4;
        int B = 6;
        int gcd = gcdCalc(A,B);
        int mul = A*B;
        int ans = mul/gcd;
        System.out.println(ans);
    }
    static int gcdCalc(int a,int b){
        if(b==0)
            return a;
        return gcdCalc(b,a%b);
    }
}
