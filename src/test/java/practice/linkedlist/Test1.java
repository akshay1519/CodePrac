package practice.linkedlist;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
//        int[] A = {2,4,1,2}; //2
//        int[] A = {-1,2}; //9
//        int[] A = {-3,-4,4}; // 0
//        int[] A = {-3,2,-4,-1,-5};
        int[] A = {0};
        int B = 1000000;
        ArrayList<Integer> pf = new ArrayList<>();
        int n = A.length;
        int sum = 0;
        int ans = -1;
        boolean flag = false;
        for(int i = 0;i<n;i++){
            sum += A[i];
            if(Math.abs(sum)<B)
                pf.add(sum);
            else
                ans = 0;
        }
        for(int i=0;i<n;i++){
            if(pf.get(i)==0 && i-1>=0){
                ans = B - Math.abs(pf.get(i-1))+1;
                break;
            }
        }
        if(pf.size()==1 && pf.get(pf.size()-1)==0){
            ans =  B;
        }
        if(ans == -1){
            if(A[0]>0)
                ans = B - Math.abs(pf.get(pf.size()-1))+1;
            else
            if(pf.get(pf.size()-1)<0)
                ans = B - Math.abs(pf.get(pf.size()-1))+1 ;
            else
                ans = B - Math.abs(pf.get(pf.size()-1));
        }
        System.out.println(ans);
    }
}
