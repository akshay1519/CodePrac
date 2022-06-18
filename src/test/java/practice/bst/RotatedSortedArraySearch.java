package practice.bst;

import java.util.ArrayList;
import java.util.Arrays;

public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177));
        int B = 5;
        int l = 0;
        int h = A.size()-1;
        int n = A.size();
        int ans = -1;
        while (l<=h){
            int mid = (l+h)/2;
            if (B == A.get(mid)){
                ans = mid;
                break;
            }else if (A.get(0) <= A.get(mid)) { //i.e. left part is sorted
                if (A.get(0) <= B && B < A.get(mid))
                    h = mid - 1; //B lies on left part
                else l = mid + 1;
            } else { //right part is sorted
                if (A.get(mid) < B && B <= A.get(n - 1))
                    l = mid + 1; //B lies on right part
                else h = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
