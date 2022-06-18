package practice.recursion;

import java.util.ArrayList;

public class TowerOfHanoi {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//    static ;
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        towerOfHanoi(1,1,2,3,ans);
        System.out.println(ans);

    }
    public static  void towerOfHanoi(int n,int s,int t,int d,ArrayList<ArrayList<Integer>> ans) {
        ArrayList<Integer> step = new ArrayList<>();
        if(n == 0)
            return;
        towerOfHanoi(n-1,s,d,t,ans);
        step.add(n);
        step.add(s);
        step.add(d);
        ans.add(step);
        towerOfHanoi(n-1,t,s,d,ans);
    }
}
