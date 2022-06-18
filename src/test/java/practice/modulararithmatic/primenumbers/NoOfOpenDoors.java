package practice.modulararithmatic.primenumbers;

public class NoOfOpenDoors {
    public static void main(String[] args) {
        int A = 25;
        int count = 0;
        for (int i=1;i*i<=A;i++){
            count++;
        }
        System.out.println(count);
    }
}
