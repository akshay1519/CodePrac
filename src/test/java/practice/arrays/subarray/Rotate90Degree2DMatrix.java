package practice.arrays.subarray;

public class Rotate90Degree2DMatrix {
    public static void main(String[] args) {
//        int[][] A= {{31, 32, 228, 333},{79, 197, 241, 246},{77, 84, 126, 337},{110, 291, 356, 371},};
        int[][] A = {{1,2},{3,4}};
        int n = A.length;
        for (int i=0;i<n/2;i++){
            for (int j=i;j<n-i-1;j++){
                int temp = A[i][j];
                A[i][j] = A[n-j-1][i];
                A[n-j-1][i] = A[n-i-1][n-j-1];
                A[n-i-1][n-j-1] = A[j][n-i-1];
                A[j][n-i-1] = temp;
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j]+" ,");
            }
            System.out.println();
        }
    }
}
