package practice.arrays.array;

public class MulOfPrvAndLast {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
//        int[] A = {1, 2};
        int n = A.length;
        int[] ans = new int[A.length];
        int j = 0;
        if(n>1){
            ans[j++] = A[0] * A[1];
        }
        for (int i=1;i<n-1;i++){
            ans[j++] = A[i-1]*A[i+1];
        }
        if(n>1){
            ans[j++] = A[n-2]*A[n-1];
        }
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" , ");
        }
    }
}
