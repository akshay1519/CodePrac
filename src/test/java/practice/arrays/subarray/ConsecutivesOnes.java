package practice.arrays.subarray;

public class ConsecutivesOnes {
    public static void main(String[] args) {
        String A = "010100110101";
        int n = A.length();
        char[] arr = A.toCharArray();
        int count1 = 0;
        int count0 = 0;
        int result = 0;
//        int i =0;
//        int j = 1;
        if(n>1) {
            for (int i = 1; i < n; i++) {
                if (arr[i] == '0') {
                    if (arr[i - 1] == '1' && arr[i + 1] == '1'){

                        count0++;
                    }
                }
                if(arr[i] == '1'){
                    count1++;
                }
                if(result<count1){
                    result = count1;
                }
            }
        }
        System.out.println(count0+count1);
    }
}
