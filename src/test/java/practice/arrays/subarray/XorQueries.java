package practice.arrays.subarray;

public class XorQueries {
    public static void main(String[] args) {
        int[] A = {1, 0, 0, 0, 1};
        int[][] B = {{2, 4}, {1, 5}, {3, 5}};
        int n = B.length;
        int[][] ans = new int[n][2];
        int temXor = 0;
        int count= 0;
        for (int i = 0; i < B.length; i++) {
            count = 0;
            temXor = A[B[i][0]-1];
            if(temXor ==0)
                count++;
            for (int j=B[i][0];j<B[i][1];j++){
                temXor ^= A[j];
                if(A[j] == 0)
                    count++;
            }
            ans[i][0] = temXor;
            ans[i][1] = count;
        }
        for (int i=0;i<ans.length;i++){
            for (int j=0;j<2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
