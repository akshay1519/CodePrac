package practice.arrays.subarray;

public class BaggersOutsideTemple {
    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] ans = new int[A];
        for(int i=0;i<B.length;i++){
            for (int j=B[i][0]-1;j<B[i][1];j++){
                ans[j] += B[i][2];
            }
        }
        for (int i=0;i<A;i++){
            System.out.println(ans[i]);
        }
    }
}
