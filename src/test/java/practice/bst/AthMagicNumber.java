package practice.bst;

public class AthMagicNumber {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        long ans=0;
        long left=Math.min((long)B,(long) C);
        long right=(long)1e15;
        long lcm=lcm(B,C);
        while(left <= right) {
            long mid=(left+right)/2;
            long multipleOfB=mid/B;
            long multipleOfC=mid/C;
            long multipleOfBOrC = mid/lcm;
            long totalDivisibleTillMid=(multipleOfB + multipleOfC) - multipleOfBOrC;
            if(totalDivisibleTillMid >= A) {
                ans=mid;;
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        System.out.println(ans);
//        return (int)(ans%1000000007);
    }
    //Method to return gcd
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    // method to return LCM of two numbers
    public static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
}
