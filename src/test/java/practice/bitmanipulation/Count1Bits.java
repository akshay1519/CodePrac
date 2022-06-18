package practice.bitmanipulation;

public class Count1Bits {
    public static void main(String[] args) {
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110";
//        String A = "1";
//        String B = "1";
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        int m = A.length();
        int n = B.length();
        System.out.println(m+" $$ "+n);
        while (Math.max(m,n)>0 || carry!=0){
            m--;
            n--;
            int sum = 0;
            sum += carry;
            sum += (m>=0)?charA[m]-48:0;
            sum += (n>=0)?charB[n]-48:0;
            sb.append(sum%2);
            carry = sum/2;
        }
        System.out.println(sb);
        String ans = sb.reverse().toString();
        System.out.println(ans);
        System.out.println(sb.length());
    }
}
