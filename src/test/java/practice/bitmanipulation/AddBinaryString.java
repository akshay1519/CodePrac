package practice.bitmanipulation;

public class AddBinaryString {
    public static void main(String[] args) {
        String A = "1100011";
        String B = "110011111";
        StringBuilder sb = new StringBuilder();
        int n = Math.min(A.length(),B.length());
        int aLen = A.length();
        int bLen = B.length();
        int carry = 0;
        for (int i=aLen-1 , j = bLen-1;i>=0 &&  j>=0;i--,j--){
            int sum = A.charAt(i) - '0' + B.charAt(j) - '0'+carry;
            sb.append(sum%2);
            carry = sum/2;
            aLen --;
            bLen --;
        }
        while (aLen>0){
            int sum = A.charAt(--aLen) -'0' + carry;
            sb.append(sum%2);
            carry = sum/2;
        }
        while (bLen>0){
            int sum = B.charAt(--bLen) - '0' + carry;
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry==1)
            sb.append(1);
        sb.reverse();
        String ans = sb.toString();
        System.out.println(sb);
    }
}
