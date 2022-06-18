package practice.hashmaps;

import java.util.*;

public class DiffK2 {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13);
        int K = 60;
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i:A){
            if(set.contains(K+i)){
                ans = 1;
                break;
            }else if(set.contains(i-K)) {
                ans = 1;
                break;
            }else {
                set.add(i);
            }
        }
        System.out.println(ans);
    }
}
