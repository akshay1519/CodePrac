package practice.arrays.array;

public class TimeToEquality {
    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2};
        int  n = A.length;
        int max = Integer.MIN_VALUE;
        int seconds = 0;
        for (int i = 0;i<n;i++){
            if(max<A[i]){
                max = A[i];
            }
        }
        for (int i = 0;i<n;i++){
            seconds += max-A[i];
        }
        System.out.println(seconds);
    }
}
