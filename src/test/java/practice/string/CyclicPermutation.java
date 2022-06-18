package practice.string;

public class CyclicPermutation {
    public static void main(String[] args) {
        String A = "1111";
//        String B = "1011000010";
        String B = "1111";
        int ans = solve(A,B);
        System.out.println(ans);

    }
    public static int solve(String A, String B) {
        StringBuilder sbA = new StringBuilder(A);
        StringBuilder temp = new StringBuilder(A);
        sbA.append(A);
        int k = A.length()-1;
        int count = 0;
        boolean equals = temp.toString().equals(B);
        if (equals){
            count++;
        }
        System.out.println(sbA);
        for (int i=1;i<B.length();i++){
            temp.deleteCharAt(0);
            temp.append(sbA.charAt(k+i));
            equals = temp.equals(B);
            if (equals){
                count++;
            }
        }
        return count;
    }
}
