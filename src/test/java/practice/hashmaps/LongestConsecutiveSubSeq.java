package practice.hashmaps;

import java.util.*;

public class LongestConsecutiveSubSeq {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(100, 4, 200, 1, 3, 2));
        Set<Integer> set = new HashSet<>(A);
        Set<Integer> minSet = new HashSet<>();
        int ans = 0;
        int val = A.get(0);
        for (int i:A){
            if (!set.contains(i-1)){
                int j = i;
                int count = 0;
                while (set.contains(j)){
                    count++;
                    j++;
                    ans = Math.max(ans,count);
                }
            }
        }
        System.out.println(ans);
        System.out.println(minSet);


    }
}
