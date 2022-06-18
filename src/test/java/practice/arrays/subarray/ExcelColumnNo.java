package practice.arrays.subarray;

public class ExcelColumnNo {
    public static void main(String[] args) {
        String A = "ABCD";
        char[] arr = A.toCharArray();
        int n = A.length();
        int ans = 0;
        int ans1 = 0;
        for (int i=0;i<n-1;i++){
            int temp = pow(26,n-1-i);
            ans += (arr[i]-64)*temp;
        }
        ans += (arr[n-1]-64);
        System.out.println(ans);
    }
    static int pow(int val,int pow){
        int power = 1;
        for (int i=0;i<pow;i++){
            power *= val;
        }
        return power;
    }
}
