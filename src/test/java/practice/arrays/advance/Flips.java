package practice.arrays.advance;

import java.util.ArrayList;

public class Flips {
    public static void main(String[] args) {
        String A = "010";
        int n = A.length();
        int curr = 0;
        int maxSofar = 0 ;
        ArrayList<Integer> ans = new ArrayList<>();
        int l = -1 , r = -1 , si = 0 ;
        for (int i=0 ; i<n ; i++) {
            if (A.charAt(i) == '0')
                curr++ ;
            else
                curr-- ;

            if (curr > maxSofar) {
                maxSofar = curr ;
                l = si;
                r = i ;
            }
            if (curr < 0) {
                si = i+1 ;
                curr = 0 ;
            }
        }

        if (l == -1)
            System.out.println(ans);
        else {
            ans.add(l+1);
            ans.add(r+1);
            System.out.println(ans);
    }
//        int n = A.length();
//        ArrayList<Integer> ans = new ArrayList<>();
//        boolean flag = true;
//        int curr = 0;
//        int max = 0;
//        int lMax = -1;
//        int rMax = -1;
//        int l=0;
//        for (int i = 0;i<n;i++){
//            if (A.charAt(i)=='0') {
//                curr++;
//                flag = false;
//            }else {
//                curr--;
//            }
//            if(curr>max){
//                max = curr;
//                lMax = l;
//                rMax = i;
//            }
//            if (curr<0){
//                curr = 0;
//                l = i+1;
//            }
//        }
//        if (flag){
//            System.out.println(ans);
//        }
//        else {
//            ans.add(lMax);
//            ans.add(rMax);
//        }
//        System.out.println(ans);

    }
}
