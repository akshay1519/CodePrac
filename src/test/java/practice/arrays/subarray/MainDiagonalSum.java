package practice.arrays.subarray;

public class MainDiagonalSum {
    public static void main(String[] args) {
        int[][] A = {{1, -2, -3}, {-4, 5, -6},{-7, -8, 9}};
        int n = A.length;
        int sum = 0;
        for (int i = 0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j)
                    sum+= A[i][j];
            }
        }
        System.out.println(sum);
    }
}
