package practice.bitmanipulation;

public class ReverseBits {
    public static void main(String[] args) {
        long a = 3;

//        bits.append(Integer.toBinaryString(a));
//        bits.reverse();
        StringBuilder bits = new StringBuilder();
        long ans = 0;
        int s = bits.length();
        for (int i=0;i<32;i++){
            bits.append(getBit((int) a,i));
        }
        int j = 0;
        for (int i=31;i>=0;i--){
            ans = ((long) bits.charAt(j++) - '0' <<i)|ans;
        }
        System.out.println(bits.length());
        System.out.println(bits);
        System.out.println(ans);
    }
    public static int getBit(int n, int k) {
        return (n >> k) & 1;
    }
}
