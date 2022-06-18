package practice.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int A = 125;
        System.out.println(Math.pow(2,3));
        System.out.println(sum(A,0));
    }
    public static int sum(int A,int sum){
        if(A<10){
            return A;
        }
        return A%10 + sum(A/10, sum);
    }
}
