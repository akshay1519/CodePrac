package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForRange {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 7, 7, 7, 8, 10, 10 ));
        int B = 3;
        int l = 0;
        int r = A.size()-1;
        int mid = 0;
        int sIndex = -1;
        int eIndex = -1;
        ArrayList<Integer> ans = new ArrayList<>();
//        if(B>A.get(A.size()-1) || B<A.get(0)){
//            ans.add(-1);
//            ans.add(-1);
//        }
        while (l<=r){
            mid = (l+r)/2;
            if (A.get(mid)==B){
                sIndex = mid;
                r = mid-1;
            }else if(A.get(mid)<B){
                l = mid+1;
            }else {
                r = mid-1;
            }

        }
        l = 0;
        r = A.size()-1;
        while (l<=r){
            mid = (l+r)/2;
            if (A.get(mid)==B){
                eIndex = mid;
                l = mid+1;
            }else if(A.get(mid)<B){
                l = mid+1;
            }else {
                r = mid-1;
            }

        }

        System.out.println(sIndex);
        System.out.println(eIndex);

    }
}
