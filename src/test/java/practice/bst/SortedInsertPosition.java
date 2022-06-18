package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedInsertPosition {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 5, 7,8));
        int B = 6;
        System.out.println(searchInsert(A,B));

    }
    public static int searchInsert(ArrayList<Integer> A, int B) {
        int l = 0;
        int r = A.size()-1;
        int mid = 0;
        int index = 0;
        if(B>A.get(A.size()-1)){
            return A.size();
        }else if(B<A.get(0)){
            return 0;
        }
        while (l<=r){
            mid = (l+r)/2;
            if(A.get(mid)==B){
                index = mid;
                break;
            }else if(A.get(mid)<B){
                l = mid+1;
            }else {
                r = mid-1;
                index = mid;
            }
        }
        return index;
    }
}
