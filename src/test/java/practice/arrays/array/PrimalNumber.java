package practice.arrays.array;

public class PrimalNumber {
    public static void main(String[] args) {
        int[] A = {-11, 7, 8, 9, 10, 11};
        int n = A.length;
        int count = 0;
        for (int i=0;i<n;i++){
            boolean flag = true;
            if(A[i]>1){
                for (int j=2;j*j<=A[i];j++){
                    if(A[i]%j==0) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
