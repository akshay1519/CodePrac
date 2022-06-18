package practice.arrays.array;

public class CopyArray {
    public static void main(String[] args) {
        int[] A  = {1,2,3,2,1};
        int B = 3;
        int n = A.length;
        int[] ans = new int[n];
        for (int i=0;i<n;i++){
            ans[i] = A[i]+B;
        }
    }
}
