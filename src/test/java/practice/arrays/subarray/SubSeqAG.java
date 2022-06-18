package practice.arrays.subarray;

public class SubSeqAG {
    public static void main(String[] args) {
        String A = "ABCGAG";
        int n = A.length();
        int ans = 0;
        int aCount = 0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='A')
                aCount++;
            if (A.charAt(i)=='G')
                ans += aCount;
        }
        System.out.println(ans);
    }
}
