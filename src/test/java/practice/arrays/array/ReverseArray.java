package practice.arrays.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] A = {1,1,10,5,4};
        int n = A.length;
        int[] B = new int[n];
        for (int i=0,j=n-1;i<n && j>=0;i++,j--){
            B[i]=A[j];
        }
        for (int i=0;i<n ;i++){
            System.out.print(B[i]);
        }
        System.out.println();
    }
}
