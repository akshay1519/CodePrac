package practice.recursion;

import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        int a = 10;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        for(int i=0;i<a;i++){
            int currsize = ans.size();
            for(int j=currsize-1;j>=0;j--){
                ans.add(ans.get(j)+(1<<i));
            }
        }
        System.out.println(ans);
    }
}
