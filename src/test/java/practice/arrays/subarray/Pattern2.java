package practice.arrays.subarray;

public class Pattern2 {
    public static void main(String[] args) {
        int A = 3;
        int[][] ans = new int[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                if(A-1-j > i)
                    ans[i][j] = 0;
                else
                    ans[i][j] = A-j;
            }
        }
            for (int i = 0; i < A; i++) {
                for (int j = 0; j < A; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }
}
