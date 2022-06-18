package practice.arrays.subarray;

public class DivBy8 {
    public static void main(String[] args) {
        String A = "17472";
        int n = A.length();
        int val = 0;
        int ans = val;
        if(n<4) {
            if(Integer.parseInt(A) % 8 == 0) {
                ans = 1;
            }
        }
        else{
            int j=0;
            int limit = n-1-4;
            for (int i = n-1; i >= limit; i--) {
                int x = Integer.parseInt(String.valueOf(A.charAt(i)));
                val += x *  power(10,j++);
            }
            if(val%8==0) {
                val = 1;
                ans = 1;
            }
        }
        System.out.println(val);
        System.out.println(ans);
        System.out.println(power(10,2));
    }
    static int power(int val,int power){
        int powerVal = 1;
        for (int i= 0;i<power;i++){
            powerVal *= val;
        }
        return powerVal;
    }
}
