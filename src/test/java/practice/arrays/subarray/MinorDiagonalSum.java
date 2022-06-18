package practice.arrays.subarray;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        int[][] A = {{1,-2,-3},{-4,5,-6},{-7,-8,9}};
        int n = A.length;
        int i = 0,j=n-1;
        int ans = 0;
        while (i<n){
            ans += A[j--][i++];
        }
        System.out.println(ans);
    }
}
