package practice.arrays.subarray;

import java.util.ArrayList;

public class RowColumnZero {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,0},{9,2,0,4}};
        int n = A.length;
        int m = A[0].length;
        int[][] ans = new int[n][m];
        ArrayList<Integer> tempI = new ArrayList<>();
        ArrayList<Integer> tempj = new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                ans[i][j] = A[i][j];
                if(A[i][j]==0) {
                    tempI.add(i);
                    tempj.add(j);
                }
            }
        }
        for (int i=0;i<tempI.size();i++){
            int si = tempI.get(i);
            int sj = tempj.get(i);
            int j = 0;
            int k = 0;
            while (j<m){
                ans[si][j++] = 0;
            }
            while (k<n){
                ans[k++][sj] = 0;
            }
        }
        for (int j=0;j<n;j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(ans[j][i]+" ,");
            }
            System.out.println();
        }
    }
}
