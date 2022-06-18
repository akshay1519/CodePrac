package practice.arrays.subarray;

public class SameMatrix {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};
        int n = A.length;
        int m = A[0].length;
        for (int i=0;i<n;i++){
            for (int j = 0;j<m;j++){
                if(A[i][j]!=B[i][j])
                    break;
            }
        }
    }
}
