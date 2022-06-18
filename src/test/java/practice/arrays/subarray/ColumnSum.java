package practice.arrays.subarray;

public class ColumnSum {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{12,14,15,16}};
        int n = A[0].length;
        int[] ans = new int[n];
        for (int j=0;j<n;j++) {
            for (int i = 0; i < A.length; i++) {
                ans[j] += A[i][j];
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
