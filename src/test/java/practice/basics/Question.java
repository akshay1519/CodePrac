package practice.basics;

public class Question {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "Hello";
        String[] arr = str.split(" ");
        boolean flag = false;
        for (String s:arr){
            if (s.equals(str1)){
               flag = true;
            }
        }
        System.out.println(flag);
    }
}
