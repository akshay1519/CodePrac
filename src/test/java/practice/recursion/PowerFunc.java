package practice.recursion;

public class PowerFunc {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 1;
        int ans = (pow(A,B,C))<0?A+C: (int) pow(A, B, C);
        System.out.println((int)ans);
//        System.out.println((ans%C)%C);
    }
    public static long pow(int A, int B, int C) {
        if(B==0)
            return 1;
        long halfpow = pow(A,B/2,C);
        long halfAns = (halfpow % C * halfpow%C)%C;
        if(B%2==0){
            return halfAns;
        }else{
            return ((halfAns%C) * (A%C))%C;
        }
    }
}
//        else if(B%2==0)
//            return pow((int) ((long)(A%C)*(A%C)),B/2,C)%C;
//        else
//            return pow((A%C),B/2,C)%C;
