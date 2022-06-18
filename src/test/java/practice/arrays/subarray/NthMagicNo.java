package practice.arrays.subarray;

public class NthMagicNo {
    public static void main(String[] args) {
        int A = 10;
        int x = 1;
        int ans = 0;
        while (A>0){
            x = x*5;
            if(A%2==1)
                ans += x;
            A /=2;
        }
        System.out.println(ans);
    }
}
