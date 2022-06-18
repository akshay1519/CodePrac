package practice.modulararithmatic;

public class ImplementPowerFunction {
    public static void main(String[] args) {
        int p = pow(71045970,41535484,64735492);
        System.out.println(p);
    }
    public static int pow(int A,int B,int C){
        if(A==0)
            return 0;
        if(B==0){
            return 1;
        }
        long halfPow = (long)pow(A, B/2, C)%C;
        long halfRes = ((halfPow % C)*(halfPow % C)) % C;

        if(B % 2 == 0) return (int)halfRes;
        return (int)(((halfRes%C*(A % C))%C + C)%C) % C;
    }

}
