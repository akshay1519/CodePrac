package practice.arrays.array;

public class FizzBuzz {
    public static void main(String[] args) {
        int A = 5;
        String[] arr = new String[A];
        for (int i=1;i<=A;i++){
            if(i%3==0 && i%5==0){
                arr[i-1] = "FizzBuzz";
            }else if(i%3==0){
                arr[i-1] = "Fizz";
            }else if(i%5==0){
                arr[i-1] = "Buzz";
            }else {
                arr[i-1] = String.valueOf(i);
            }
        }
        for (int i=0;i<A;i++){
            System.out.println(arr[i]);
        }
    }
}
