package practice.problemsolving;

public class AdjacentDiff {
    public static void main(String[] args) {
        int[] A = {6, 2, 4, 4, 3};
        int n = A.length;
        int[] ans = new int[A.length-1];
        for (int i=1;i<n;i++){
            ans[i-1] = A[i]-A[i-1];
        }
        for (int j=0;j<ans.length;j++){
            System.out.println(ans[j]);
        }
    }
}
