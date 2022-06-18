package practice.bst;

public class SqrtOfInteger {
    public static void main(String[] args) {
        int A = 2147483647;
//        int A = 5;
//        double A = 1;
        int b = Integer.MAX_VALUE;
        int ans = sqrt(A);
        System.out.println(ans);
        System.out.println((int)Math.sqrt(A));
        System.out.println((int)Math.sqrt(b));
    }
    public static int sqrt(int A){
        int n = A/2;
        if(A == 0)
            return 0;
        if(A == 1)
            return 1;
        int l =  0;
        int h = 46340;
        int ans =  -1;
        while (l<=h){
            int mid = l + ((h-l)/2);
            long val = (long) mid * mid;
            if (val == A){
                ans = mid;
            }
            if (val > A){
                h = mid -1;
            }else {
                l = mid+1;
                ans = mid;
            }
        }
        return (int) ans;
    }
}
