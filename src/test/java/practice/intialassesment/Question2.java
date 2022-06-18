package practice.intialassesment;

public class Question2 {
    public static void main(String[] args) {
        int[] A = {1,1,1};
        int B = 2;
        int n = A.length;
        int count = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (A[i]+A[j]==B)
                    count++;
            }
        }
        System.out.println(count);
    }
}
