package practice.problemsolving;

public class MinPicks {
    public static void main(String[] args) {
//        int[] A = { -98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
        int[] A = {-92, 22, 2, 11, 39, 36, 36, 51, 71, 42 };
        int n = A.length;
        int evenMax = Integer.MIN_VALUE;
        System.out.println(-98%2);
        int oddMin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(A[i]%2==0 && evenMax<A[i])
                evenMax = A[i];
            else if(A[i]%2 != 0 && oddMin>A[i])
                oddMin = A[i];
        }
        System.out.println(evenMax+" "+oddMin);
        int ans = evenMax - oddMin;
        System.out.println(ans);
    }
}
