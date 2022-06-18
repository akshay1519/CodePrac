package practice.intialassesment;

public class Question4 {
    public static void main(String[] args) {
        int[] A = {4,7,-4,2,2,2,3,-5,-3,9,-4,9,-7,7,-1,9,9,4,1,-4,-2,3,-3,-5,4,-7,7,9,-4,4,-8};
        int B = -3;
        int n = A.length;
        int index1=0,index2=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = A[i]+A[j];
                if(sum==B){
//                    if(A[index2]>A[j]){
//                        if(A[index1]>A[i]) {
//                            index1 = i;
//                            index2 = j;
//                        }else{
                            index1 = i;
                            index2 = j;
                    System.out.println(index1+" "+index2+" Value "+A[index1]+" "+A[index2]);
//                        }
//                    }
                }
            }
        }
//        System.out.println(index1+" "+index2);
    }
}
