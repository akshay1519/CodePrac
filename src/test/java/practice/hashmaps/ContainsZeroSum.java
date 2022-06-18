package practice.hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContainsZeroSum {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList( -8, 8, -1, -16, -28, -27, 15, -14, 14, -27, -5, -6, -25, -11, 28, 29, -3, -25, 17, -25, 4, -20, 2, 1, -17, -10, -25);
        List<Integer> ps = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap();
        int ans = 0;
        int sum = 0;
        for (int i : A) {
            sum += i;
            ps.add(sum);
            if(sum == 0 || i==0){
                ans = 1;
                break;
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
                ans = 1;
                break;
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
