package practice.modulararithmatic;


import java.util.ArrayList;

public class ReArrangeArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(0);
        a.add(1);
        int n = a.size();
        for (int i=0;i<n;i++){
            a.set(i,a.get(i)*n);
        }
        System.out.println(a);
        for (int i=0;i<n;i++){
            int index = a.get(i)/n;
            a.set(i,a.get(i)+a.get(index)/n);
        }
        System.out.println(a);
        for (int i=0;i<n;i++){
            a.set(i,a.get(i)%n);
        }
        System.out.println(a);
    }
}
