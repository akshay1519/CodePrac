package practice.arrays.subarray;

public class GCD {
    public static void main(String[] args) {
//        int A = 106978;
//        int B = 25412;
//        int A = 5449763;
//        int B = 5079530;
//        int A = 7939569;
//        int B = 7927328;
        int A = 106978; //4380528
        int B = 4487506;
        int maxVal = Math.max(A,B);
        int ans = 1;
//        for (int i=maxVal;i>1;i--){
//            if(A%i == B%i) {
//                ans = i;
//                break;
//            }
//        }
       ans = Math.abs(Math.max(A,B)-Math.min(A,B));
        System.out.println(ans);
    }
    static int gcdCalc(int A,int B){
        if(B<=1)
            return A;
        return gcdCalc(B,A/B);
    }
}
