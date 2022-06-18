package practice.arrays.advance;

import java.util.ArrayList;

public class SpralOrderMatrix {
    public static void main(String[] args) {
        int A = 5;
        int[][] mat = new int[A][A];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = A;
        int k = 1;
        int t = 0;
        int b = n-1;
        int l = 0;
        int r = n-1;
        while (t<=b && l<=r){
            for (int i=l;i<=r;i++){
                mat[t][i] = k++;
            }
            t++;
            for (int i=t;i<=b;i++){
                mat[i][r] = k++;
            }
            r--;
            for (int i = r;i>=l;i--){
                mat[b][i] = k++;
            }
            b--;
            for(int i=b;i>=t;i--){
                mat[i][l] = k++;
            }
            l++;
        }
        for (int i=0;i<A;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j=0;j<A;j++){
                temp.add(mat[i][j]);
            }
            ans.add(temp);
        }
        System.out.println(ans);
    }
}
