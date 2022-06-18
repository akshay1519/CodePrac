package practice.recursion;

public class MagicNum {
    public static void main(String[] args) {
        int A = 1291;
        int ansSum = sum(A,0);
        while (ansSum>=10){
            ansSum = sum(ansSum,0);
        }
        System.out.println(ansSum);
    }
    public static int sum(int A,int sum){
        if(A<10){
            return A;
        }
        return A%10 + sum(A/10, sum);
    }
}
