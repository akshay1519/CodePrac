package practice.string;

public class ReverseWord {
    public static void main(String[] args) {
        String A = "the sky is blue";
		int n = A.length();
		StringBuilder sb = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		for(int i=n-1;i>=0;i--){
			sb.append(A.charAt(i));
		}
		StringBuilder temp = new StringBuilder();
        for (int i = 0;i<n;i++){
        	if(sb.charAt(i)!=' '){
        		temp.append(sb.charAt(i));
			}else {
        		ans.append(temp.reverse());
        		ans.append(" ");
        		temp.delete(0,temp.length());
			}
		}
        ans.append(temp.reverse());
        System.out.println(ans.toString().trim());
    }
}