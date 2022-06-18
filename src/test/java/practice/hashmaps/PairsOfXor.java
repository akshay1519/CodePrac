package practice.hashmaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PairsOfXor {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(3, 6, 8, 10, 15, 50);
        int B = 5;
        HashSet<Integer> set = new HashSet<>();
        set.addAll(A);
        int count = 0;
        for (int i:A){
            if (set.contains(i^B))
                count++;
        }
        System.out.println(count/2);
    }
}
