package practice.permutationandcombination;

public class ncr {
    public static void main(String[] args) {
//        nCr % m = (n!/((n-r)!*r!))% m.
        int A = 4889;//41;
        int B = 4032;//27;
        int C = 72871;//14// 3;
        String z = "abc";
        int n = z.length();
        long ans = compute(A,B,C);
        System.out.println(ans);
    }
    public static long compute(int n,int r,int m){
        long[][] c = new long[n+1][r+1];
        int i,j;
        for (i=0;i<=n;i++){
            for (j=0;j<=Math.min(r,i);j++){
                if (j==0 || j==i){
                    c[i][j] = 1;
                }else {
                    c[i][j] = ((c[i-1][j-1] % m) +(c[i-1][j]%m))%m;
                }
            }
        }
        return c[n][r]%m;
    }

}
