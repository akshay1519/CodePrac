package practice.bitmanipulation;

public class NumberOfOneBits {
    public static void main(String[] args) {
        int n = 11;
        int count = 0;
        for (int i=0;i<32;i++){
            if(((n>>i) & 1) == 1)
                count++;
        }
        System.out.println(count);
    }
}
