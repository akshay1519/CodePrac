package practice.arrays.subsqeqandsubset;

public class FindSubSeq {
    public static void main(String[] args) {
        String A = "bigdft";
        String B = "dfbkjijgbbiihbmmt";
        String ans = "NO";
        char[] ar = B.toCharArray();
        if(A.length()>B.length()){
            System.out.println("NO");
        }
        int i = 0;
        boolean flag = false;
        for(char ch:ar){
            if(i<A.length() && ch==A.charAt(i)){
                i++;
            }
        }
        if(i==A.length()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
