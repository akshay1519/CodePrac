package practice.problemsolving;

public class PrintPatter {
    public static void main(String[] args) {
        int A = 4;
        int[][] arr = new int[A][A];
        for (int i = 0;i<A;i++){
            for (int j=0;j<A;j++){
                if(j<=i){
                    arr[i][j] = j+1;
                }else
                    arr[i][j] = 0;
            }
        }
    }
}
