package practice.arrays.array;

public class SUbAraayAverage {
    public static void main(String[] args) {
        int[] A = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        int B = 9;
        int n = A.length;
        int i = 0;
        int j = 1;
        int sum = A[0];
        int lSum = Integer.MAX_VALUE;
        int ansIndex = 0;
        while (j<n){
            if(j-i<B)
                sum += A[j++];
            else {
                if (sum < lSum) {
                    lSum = sum;
                    ansIndex = i;
                }
                sum -= A[i++];
                sum += A[j++];
            }
        }
        if (sum < lSum) {
            lSum = sum;
            ansIndex = i;
        }
        System.out.println(ansIndex);
    }
}
