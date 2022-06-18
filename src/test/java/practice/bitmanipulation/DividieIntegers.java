package practice.bitmanipulation;

public class DividieIntegers {
    public static void main(String[] args) {
        int A = -2147483648;
        int B = -1;
        long n = A;
        long m = B;
        int sign = 1;
        if (n<0)
            sign = -sign;
        if (m<0)
            sign = -sign;
        n = Math.abs(n);
        m = Math.abs(m);
        long ans = 0;
        for (int i=31;i>=0;i--){
            if ((m<<i)<=n){
                n -= (m<<i);
                ans += (1L <<i);
            }
        }
        if (sign<0){
            ans = -ans;
        }
        if (ans > Integer.MAX_VALUE){
            ans = Integer.MAX_VALUE;
        }
        System.out.println(ans);
    }
}
