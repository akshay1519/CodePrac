package practice.arrays.subarray;

public class SomOddEvenIndex {
    public static void main(String[] args) {
        int[] A = {2, 1, 6, 4};
        int n = A.length;
        int[] oPrefixSum = new int[n];
        int[] ePrefixSum = new int[n];
        int oddSum = 0;
        int evenSum = 0;
        int count = 0;
        for (int i=0;i<n;i++){
            if(i%2 == 0){
                oddSum += A[i];
                oPrefixSum[i] = oddSum;
                ePrefixSum[i] = evenSum;
            }else{
                evenSum += A[i];
                oPrefixSum[i] = oddSum;
                ePrefixSum[i] = evenSum;
            }
        }
        if(oPrefixSum[0]==ePrefixSum[n-1])
            count++;
        for (int i=1;i<n;i++){
            int oSum = 0;
            int eSum = 0;
            eSum = ePrefixSum[i-1]+oPrefixSum[n-1]-oPrefixSum[i];
            oSum = oPrefixSum[i-1]+ePrefixSum[n-1]-ePrefixSum[i];
            if(eSum==oSum)
               count++;
        }
        System.out.println(count);
    }
}
