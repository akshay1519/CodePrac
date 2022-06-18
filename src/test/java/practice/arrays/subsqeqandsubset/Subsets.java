package practice.arrays.subsqeqandsubset;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        List<Integer> A =Arrays.asList(15, 20, 12, 19, 4);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> fAns = new ArrayList<>();
        ArrayList<ArrayList<Integer>> newans = new ArrayList<>();
        int n = A.size();
        Collections.sort(A);
        for(int i=0;i<Math.pow(2,n);i++){
            ArrayList<Integer> subsets = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(i << ~j < 0){
                    subsets.add(A.get(j));
                }
            }
            ans.add(subsets);
        }
        Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                int an = a.size();
                int bn = b.size();
                for (int i = 0; i < Math.min(an, bn); i++) {
                    int cmp = Integer.compare(a.get(i), b.get(i));
                    if (cmp != 0)
                        return cmp;
                }
                return Integer.compare(a.size(), b.size());
            }
        });
        System.out.println(ans);
    }
}
