package practice.modulararithmatic.primenumbers;

public class ModuloInverse {
    public static void main(String[] args) {
        int A = 12;
        int B = 55557209;
        System.out.println((A % B+B)%B);
        long ans = power(A,B-2,B) % B;
        System.out.println(ans);

    }
    public static long power(int a,int b,int c){
        if(b==0){
            return 1;
        }
        long p = power(a,b/2,c)%c;
        p = (p * p) %c;
        if (b%2==0)
            return p;
        else
            return (a * p)%c;
    }
}
