package practice.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2308, 1447, 1918, 1391, 2308, 216, 1391, 410, 1021, 537, 1825, 1021, 1729, 669, 216, 1825, 537, 1995, 805, 410, 805, 602, 1918, 1447, 90, 1995, 90, 1540, 1161, 1540, 2160, 1235, 1161, 602, 880, 2160, 1235, 669));
        ArrayList<Integer> ans = new ArrayList<>();
        int commXor = 0;
        int firstXor = 0;
        int secXor = 0;
        int pos = 0;
        for (int i :A){
            commXor ^= i;
        }
        for (int i=0;i<32;i++){
            if(((commXor>>i) & 1) == 1) {
                pos = i;
                break;
            }
        }
        for (int i:A){
            if(((i>>pos) & 1) == 1){
                firstXor ^= i;
            }else {
                secXor ^= i;
            }
        }
        ans.add(firstXor);
        ans.add(secXor);
        System.out.println(firstXor);
        System.out.println(secXor);

    }
}
