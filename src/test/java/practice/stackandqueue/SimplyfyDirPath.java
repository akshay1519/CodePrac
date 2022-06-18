package practice.stackandqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimplyfyDirPath {
    public static void main(String[] args) {
        String A = "/a/./b/../../c/";
        String ans = simplifyPath(A);
        System.out.println(ans);
    }
    public static String simplifyPath(String A) {
        Stack<String> st = new Stack<>();
        String[] path = A.split("/");
        for (String s:path){
            if (!st.isEmpty() && s.equals("..")){
                st.pop();
            }else if (!s.equals(".") && !s.equals("..") && !s.equals("")){
                st.push(s);
            }
        }
        List<String> list = new ArrayList<>(st);
        return "/"+String.join("/",list);
    }
}
