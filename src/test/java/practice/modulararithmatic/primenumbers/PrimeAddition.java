package practice.modulararithmatic.primenumbers;

public class PrimeAddition {
    public static void main(String[] args) {
        int A = 2009;
        System.out.println(isPrime(A));
    }
    public static boolean isPrime(int a){
        for (int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
