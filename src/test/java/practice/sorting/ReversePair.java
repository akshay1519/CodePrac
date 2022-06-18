package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversePair {
    static long inCount=0;

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 2, 3, 1));
        solve(A);
        System.out.println(inCount);
    }
    public static void solve(ArrayList<Integer> A) {
        int[] a = new int[A.size()];
        for (int i=0;i<A.size();i++){
            a[i] = A.get(i);
        }
        solveans(a);
    }
    public static int solveans(int[] A) {
        mergeSort(A, 0, A.length-1);
        return (int) (inCount%1000000007);
    }

    static void mergeSort(int[] A, int s, int e) {
        if(s>=e)
            return;
        int m = (s+e)/2;
        mergeSort(A, s, m);
        mergeSort(A, m+1, e);
        merge(A, s, m, e);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] a1= new int[m-s+1];
        int[] a2= new int[e-m];
        int i=0,j=0,k=s;
        while(i<a1.length) {
            a1[i]=arr[s+i];
            i++;
        }
        i=0;
        while(i<a2.length) {
            a2[i]=arr[m+i+1];
            i++;
        }
        i=0;
        while(i<a1.length && j<a2.length) {
            // Before merging the array count the reverse pairs
            long l1 = a1[i];
            long l2 = a2[j];
            if(l1>2*l2) {
                inCount += a1.length-i;
                j++;
            } else
                i++;
        }
        i=0;
        j=0;
        while(i<a1.length && j<a2.length) {
            if(a1[i]>a2[j]) {
                arr[k++]=a2[j++];
            } else {
                arr[k++]=a1[i++];
            }
        }
        while(i<a1.length)
            arr[k++]=a1[i++];

        while(j<a2.length)
            arr[k++]=a2[j++];
    }
}
//    static int count = 0;
//    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 2, 3, 1));
//        sort(A,0,A.size()-1);
//        System.out.println(count);
//
//    }
//    public static void sort(ArrayList<Integer> A, int l, int r){
//        int mod = (int)(Math.pow(10,9)+7);
//        if (l<r){
//            int mid = (l+r)/2;
//            sort(A,l,mid);
//            sort(A,mid+1,r);
//            merge(A,l,mid,r);
//        }
//    }
//    public static void merge(ArrayList<Integer> A,int l,int m,int r){
//        int n1 = m-l+1;
//        int n2 = r-m;
//        ArrayList<Integer> left = new ArrayList<>();
//        ArrayList<Integer> right = new ArrayList<>();
//
//        for (int i=0;i<n1;++i){
//            left.add(A.get(l+i));
//        }
//        for (int i=0;i<n2;++i){
//            right.add(A.get(m+1+i));
//        }
//        int i = 0 ,j = 0;
//        int k = l;
//        while(i<n1 && j<n2) {
//            long l1 = left.get(i);
//            long l2 = right.get(j);
//            if(l1>2*l2) {
//                count += n1-i;
//                j++;
//            } else
//                i++;
//        }
//        while (i<n1){
//            A.set(k,left.get(i++));
//            k++;
//        }
//        while (j<n2){
//            A.set(k,right.get(j++));
//            k++;
//        }
//    }
//}
