package practice.problemsolving;

public class LowerTriangularMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 0, 0},{0, 0, 0},{-7, -8, 9}};
        int n = A.length;
        boolean flag = false;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(A[i][j]!=0) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }
        if(flag)

        System.out.println(flag);
    }
}
