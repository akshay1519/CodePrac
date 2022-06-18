package practice.arrays.advance;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumSubMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(2,3));
        ArrayList<Integer> E = new ArrayList<>(Arrays.asList(2,3));
        ArrayList<Integer> temp1 = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        ArrayList<Integer> temp2 = new ArrayList<>(Arrays.asList(2,2,2,2,2));
        ArrayList<Integer> temp3 = new ArrayList<>(Arrays.asList(3,8,6,7,3));
        ArrayList<Integer> temp4 = new ArrayList<>(Arrays.asList(4,4,4,4,4));
        ArrayList<Integer> temp5 = new ArrayList<>(Arrays.asList(5,5,5,5,5));
        A.add(temp1);
        A.add(temp2);
        A.add(temp3);
        A.add(temp4);
        A.add(temp5);

        int n = A.size();
        int m = A.get(0).size();
        long[][] pf = new long[n][m];
        pf[0][0] = A.get(0).get(0);
        for (int i=1;i<n;i++){
            pf[i][0] = pf[i-1][0]+A.get(i).get(0);
        }
        for (int j=1;j<m;j++){
            pf[0][j] = pf[0][j-1]+A.get(0).get(j);
        }
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                pf[i][j] = pf[i][j-1]+pf[i-1][j]-pf[i-1][j-1]+A.get(i).get(j);
            }
        }




        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(pf[i][j] > 9)
                    System.out.print(pf[i][j]+" ");
                else
                    System.out.print(pf[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
