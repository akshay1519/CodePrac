package practice.modulararithmatic;

public class LargePower {
    public static void main(String[] args) {
        int A = 2;
        int B = 27;
        long x = 1L;
        int mod = (int) Math.pow(10,9)+7;
        for (int i=1;i<=B;i++){
            i %= mod;
            x %= mod;
            x = (x*i)%(mod-1);
        }
        long ans = power(A,x,mod);
        System.out.println(ans);
    }
    public static long power(long a,long b,long c){
        if(b==0){
            return 1;
        }
        long p = power(a,b/2,c)%c;
        p = (p * p) %c;
        if (b%2==0)
            return p;
        else
            return (a * p)%c;
    }
}
