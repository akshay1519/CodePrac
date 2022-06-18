package practice.arrays.subarray;

public class Pattern1 {
    public static void main(String[] args) {
        int A = 3;
        int[][] ans = new int[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                if(i>=j){
                    ans[i][j] = j+1;
                }else {
                    ans[i][j] = 0;
                }
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
