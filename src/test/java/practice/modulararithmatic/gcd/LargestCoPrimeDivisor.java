package practice.modulararithmatic.gcd;

public class LargestCoPrimeDivisor {
    public static void main(String[] args) {
        int A = 21;//24;//22;//30;
        int B = 49;//36;//38;//12;
//        int A = 2;
//        int B = 3;
        System.out.println(lcd(A,B));
        System.out.println(gcd(21,49));
    }
    public static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static int lcd(int a, int b){
        if (a==1)
            return a;
        while (gcd(a,b)!=1){
            a = a/gcd(a,b);
        }
        return a;
    }
}
