package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickFromBothSides {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 );
        int B = 3;
        int n = A.size();
        int ansSum = 0;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i:A){
            sum += i;
            arr.add(sum);
        }
        if(A.size()==B){
            ansSum = sum;
        }else {
            ansSum = Math.max(arr.get(B-1),arr.get(n-1)-arr.get(n-B-1));
            for (int i=0;i<B-1;i++){
                ansSum = Math.max(ansSum,arr.get(n-1)-arr.get(n-B)+arr.get(i));
            }
        }
        System.out.println(arr);
        System.out.println(ansSum);
    }
}
