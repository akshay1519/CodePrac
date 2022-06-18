package practice.arrays.subarray;

public class AntiDiagonal {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{7,8,9,10}};
        int m = A.length;
        int[][] ans = new int[m*2-1][m];
        int k=0;
        for (int i=0;i<m;i++){
            printDiagonal(0,i,m,A,ans,k++);
        }
        for (int i=1;i<m;i++){
            printDiagonal(i,m-1,m,A,ans,k++);
        }
        System.out.println("-------------------------");
        for (int i=0;i<m*2;i++){
            for (int j=0;j<m;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static void printDiagonal(int si,int sj,int n,int[][] inp,int[][] ans,int k){
        int i = si, j = sj;
        int y=0;
        while (i<n && j>=0){
            ans[k][y++] = inp[i++][j--];
        }
    }
}
