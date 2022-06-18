package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 4, 10, 2, 1, 5));
        quickSort(A,0,A.size()-1);
        System.out.println(A);


    }
    public static void quickSort(ArrayList<Integer> A,int start,int end){
        if (start<end){
            int pi = partition(A,start,end);
            quickSort(A,start,pi-1);
            quickSort(A,pi+1,end);
        }
    }

    private static int partition(ArrayList<Integer> A, int start, int end) {
//        Random r = new Random();
//        int low = start;
//        int high = end;
//        int result = r.nextInt(high-low)+low;
//        int result = end;
        int pivot = A.get(end);
        int pIndex = start-1;
        for (int i=start;i<=end;i++){
            if (A.get(i)<pivot){
                pIndex++;
                swap(A,i,pIndex);
            }
        }
        swap(A,end,pIndex+1);
        return (pIndex + 1);
    }

    private static void swap(ArrayList<Integer> a, Integer integer, Integer integer1) {
        int temp = a.get(integer);
        a.set(integer,a.get(integer1));
        a.set(integer1,temp);
    }
}
