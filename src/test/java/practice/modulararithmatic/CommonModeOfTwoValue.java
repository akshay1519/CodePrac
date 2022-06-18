package practice.modulararithmatic;

public class CommonModeOfTwoValue {
    public static void main(String[] args) {
        int A = 6816621;
        int B = 8157697;
        int ans = Math.max(A,B)-Math.min(A,B);
        ans %= Math.max(A,B);
        System.out.println(ans);
        ans %= Math.min(A,B);
        System.out.println(ans);


    }
//    public static int gcdCalc(int a,int b){
//        if(b==0)
//            return a;
//        return gcdCalc(b,a%b);
//    }
}
