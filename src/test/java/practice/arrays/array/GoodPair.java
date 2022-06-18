package practice.arrays.array;

public class GoodPair {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int B = 2;
        int n = A.length;
        int ans = 0;
        for (int i =0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(A[i]+A[j]==B){
                    ans = 1;
                }
            }
        }
        System.out.println(ans);
    }
}
