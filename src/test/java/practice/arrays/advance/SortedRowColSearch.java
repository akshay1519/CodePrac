package practice.arrays.advance;

import java.util.ArrayList;

public class SortedRowColSearch {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        int B = 2;
        ArrayList<Integer> C = new ArrayList<>();
        C.add(1);
        C.add(2);
        C.add(3);
//        C.add(8);
        ArrayList<Integer> D = new ArrayList<>();
        D.add(4);
        D.add(5);
        D.add(6);
//        D.add(8);
        ArrayList<Integer> E = new ArrayList<>();
        E.add(7);
        E.add(8);
        E.add(9);
//        E.add(8);
        A.add(C);
        A.add(D);
        A.add(E);
        int n = A.size();
        int m = A.get(0).size();
        int ans = -1;
        int i = 0;
        int j = m-1;
       while (i<n && j>=0 ) {
           if (A.get(i).get(j) == B) {
               if(j!=0 && A.get(i).get(--j)!=B) {
                   ans = ansFun(i+1,j+2);
                   break;
               }else if(j==0){
                   ans = ansFun(i+1,j+1);
                   break;
               }
           } else if (A.get(i).get(j) < B) {
               ++i;
           } else {
               --j;
           }
       }
        System.out.println(ans);
    }
    public static int ansFun(int i,int j){
        return i * 1009 + j;
    }
}
