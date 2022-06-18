package practice.hashmaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(97, 86, 67, 19, 107, 9, 8, 49, 23, 46, -4, 22, 72, 4, 57, 111, 20, 52, 99, 2, 113, 81, 7, 5, 21, 0, 47, 54, 76, 117, -2, 102, 34, 12, 103, 69, 36, 51, 105, -3, 33, 91, 37, 11, 48, 106, 109, 45, 58, 77, 104, 60, 75, 90, 3, 62, 16, 119, 85, 63, 87, 43, 74, 13, 95, 94, 56, 28, 55, 66, 92, 79, 27, 42, 70);
        HashSet<Integer> set = new HashSet<>(A);
        int max = 0;
        for (int i:A){
            int count = 0;
            if(set.contains(i -1)){
                continue;
            }else if(set.contains(i)){
                count = 0;
                int val = i;
                for (int j = 0;j< set.size();j++){
                    if(set.contains(val++)){
                        count++;
                    }else {
                        break;
                    }
                }
            }
            max = Math.max(count,max);
        }
        Collections.sort(A);
        System.out.println(A);
        System.out.println(max);
    }
}
