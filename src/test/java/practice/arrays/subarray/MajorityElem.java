package practice.arrays.subarray;

public class MajorityElem {
    public static void main(String[] args) {
        int[] A = {3,2,3,3,3,2,2,2,2};
        int n = A.length;
        Integer maj = null;
        int freq = 0;
        for (int i = 0;i<n;i++){
            if(maj==null){
                maj = A[i];
                freq++;
            }else if(A[i]==maj) {
                freq++;
            }else if(A[i]!=maj){
                if(freq>1) {
                    freq--;
                }else {
                    maj = null;
                    freq = 0;
                }
            }
        }
        int count = 0;
        for (int i=0;i<n;i++){
            if(maj==A[i])
                count++;
        }
        if(count>(n/2))
            System.out.println(maj);
        else
        System.out.println(maj);
    }
}
