package practice.recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int A = 46;
        System.out.println(solve(A));
    }
    public static int solve(int A){
        if (A<10)
            return A;
        return solve(A/10)+A%10;
    }
}
