package practice.arrays.subarray;

public class SearchSortedRowColumn {
    public static void main(String[] args) {
        int[][] A = {{2,8,8,8},{2,8,8,8},{2,8,8,8}};
        int B = 8;
        int n = A.length;
        int m = A[0].length;
        int i=0;
        int j=m-1;
        int ans = -1;
        int val = 1009;
        while (i<n && j>-1){
            if(A[i][j]==B) {
                if(j!=0 && A[i][--j]!=B) {
                    ans = ((i + 1) * val) + (j + 2);
                    break;
                }else if(j==0) {
                    ans = ((i + 1) * val) + (j + 1);
                    break;
                }
            }else if(A[i][j]>B){
                --j;
            }else {
                ++i;
            }
        }
        System.out.println(ans);
    }
}
