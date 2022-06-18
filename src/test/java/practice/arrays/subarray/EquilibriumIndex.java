package practice.arrays.subarray;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        int n = A.length;
        int[] prefix = new int[n];
        int sum = 0;
        int ans = -1;
        for (int i = 0;i<n;i++){
            sum += A[i];
            prefix[i] = sum;
        }
        for (int i=1;i<n-1;i++){
            int sumLeft = prefix[i-1];
            int sumRight = prefix[n-1]-prefix[i];
            if(sumLeft==sumRight) {
                ans = i;
                break;
            }

        }
        for (int i = 0;i<n;i++){
            System.out.print(prefix[i]+", ");
        }
        System.out.println();
        System.out.println(ans);
    }
}
