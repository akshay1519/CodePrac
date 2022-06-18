package practice.arrays.subsqeqandsubset;

public class LittlePonny {
    public static void main(String[] args) {
        String A = "scsecugqsb";
        int n = A.length();
        int val = Integer.MAX_VALUE;
        int index = 0;
        for (int i=0;i<n-1;i++){
            int currChar = A.charAt(i)-97;
            if(currChar<val) {
                val = currChar;
                index = i;
            }
        }
        int secondIndex = index+1;
        int val1 = Integer.MAX_VALUE;
        for (int i=secondIndex;i<n;i++){
            int currChar = A.charAt(i)-97;
            if(currChar<val1){
                val1 = currChar;
                secondIndex = i;
            }
        }
        System.out.println(A.charAt(index)+""+A.charAt(secondIndex));
    }
}
