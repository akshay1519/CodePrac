package practice.arrays.subarray;

public class ModString {
    public static void main(String[] args) {
//        String A = "23";// "43535321";
//        String A = "43535321";
        String A = "842554936302263";
        int B = 41;
        int n = A.length()-1;
        int res = 0;
        int carry = 1;

        for(int i=n;i>=0;i--){
            int a =  (((Integer.parseInt(String.valueOf(A.charAt(i))))));
            if(a>0) {
                res = res + (((a % B) * carry) % B);
                carry = (carry * 10) % B;
                res = res % B;
            }else {
                carry = (carry * 10) % B;
            }
        }
        System.out.println(res);
    }
}
