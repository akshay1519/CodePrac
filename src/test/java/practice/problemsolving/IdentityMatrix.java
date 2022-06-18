package practice.problemsolving;

public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 0, 0},{0, 1, 0},{0, 0, 1}};
        int n = A.length;
        boolean flag = false;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j && A[i][j]==1) {
                    flag= false;
                }else if(A[i][j]==0){
                    flag = false;
                }else {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        System.out.println(flag);
    }
}
