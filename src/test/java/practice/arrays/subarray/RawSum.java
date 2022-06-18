package practice.arrays.subarray;

public class RawSum {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int n = A.length;
        int m = A[0].length;
        int[] ans = new int[n];
        for (int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans[i] += A[i][j];
            }
            System.out.println(ans[i]);
        }
    }
}
