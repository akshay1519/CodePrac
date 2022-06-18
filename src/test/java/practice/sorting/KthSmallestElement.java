package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestElement {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2, 1, 4, 3, 2);
        int B = 3;
        int k = B;
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i:A){
            ans.add(i);
        }
        for (int i=0;i<n;i++){
            int min = ans.get(i);
            int index = i;
            for (int j=i+1;j<n;j++){
                if(min>ans.get(j)){
                    index = j;
                    min = ans.get(j);
                }
            }
            int temp = ans.get(i);
            ans.set(i,ans.get(index));
            ans.set(index,temp);
            if(k==0){
                break;
            }
            k--;
        }
        System.out.println(ans);
        System.out.println(ans.get(B-1));

    }
}
