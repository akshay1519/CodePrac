package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeggerOutside {
    public static void main(String[] args) {
        int A = 5;
        List<List<Integer>> B = new ArrayList<>();
        B.add(Arrays.asList(3, 4, 10));
        B.add(Arrays.asList(2, 3, 20));
        B.add(Arrays.asList(2, 5, 25));
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<=A;i++){
            ans.add(0);
        }
        for (int i=0;i<B.size();i++){
            int val = B.get(i).get(2);
            int start = B.get(i).get(0);
            int end = B.get(i).get(1);
            ans.set(start-1,ans.get(start-1)+val);
            ans.set(end,ans.get(end)-val);
        }
        int sum = ans.get(0);
        for (int i=1;i<A;i++){
            sum += ans.get(i);
            ans.set(i,sum);
        }
        ans.remove(ans.size()-1);
        System.out.println(ans);
    }

}
