package practice.arrays.advance;

import java.util.ArrayList;

public class SumOfAllSubmarices {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        int sum = 0;
        int n = A.size();
        int m = A.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int topleft = (i+1) *(j+1);
                int bottomright = (n - i) * (m - j);
                sum += (topleft * bottomright * A.get(i).get(j));
            }
        }
    }
}
