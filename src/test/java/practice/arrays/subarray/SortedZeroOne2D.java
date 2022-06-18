package practice.arrays.subarray;

public class SortedZeroOne2D {
    public static void main(String[] args) {
        int[][] A = {{0,0,0,1,1,1,1}, {0,0,0,0,0,1,1}, {0,0,0,0,0,0,1},{0,0,0,0,0,0,1},{0,0,0,1,1,1,1},{0,0,1,1,1,1,1},{0,0,0,1,1,1,1}};
        int n = A.length;
        int r = n - 1;
        int t = 0;
        int ans = 0;
        while (r > 0 && t<n) {
            if (A[t][r] == 1) {
                --r;
                ans = t;
            }
            if(A[t][r]==0){
                ++t;
            }
        }
        System.out.println(ans);
    }
}
