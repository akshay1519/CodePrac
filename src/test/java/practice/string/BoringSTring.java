package practice.string;

import java.util.ArrayList;
import java.util.Collections;

public class BoringSTring {
    public static void main(String[] args) {
        String A = "iagaabf" ;//"gbedggcjac";
        int ans = solve(A);
        System.out.println(ans);

    }
    public static int solve(String A) {
        char[] ch = A.toCharArray();
        int n = ch.length;
        ArrayList<Character> g1 = new ArrayList<>();
        ArrayList<Character> g2 = new ArrayList<>();
        for (int i=0;i<n;i++){
           if (ch[i]%2 == 0){
               g1.add(ch[i]);
           }else {
               g2.add(ch[i]);
           }
        }
        int l1 = g1.size();
        int l2 = g2.size();
        Collections.sort(g1);
        Collections.sort(g2);
        if (Math.abs(g1.get(l1-1)-g2.get(0))!=1){
            return 1;
        }
        if (Math.abs(g2.get(l2-1)-g1.get(0))!=1){
            return 1;
        }

        System.out.println(g1);
//        System.out.println(g2);
//        System.out.println(g3);
        return 0;
    }
}
