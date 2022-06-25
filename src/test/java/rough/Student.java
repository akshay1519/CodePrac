package rough;

import java.util.Date;

public class Student {
    private String rollNo = "Univ-2020-";
    private static int no = 1;
    private Student(){
        rollNo = generateRollNo();
    }

    private String generateRollNo() {
        Date d = new Date();
        String rn = "Unvi-"+d.getTime()+"-"+no++;
        return rn;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        System.out.println(st1.rollNo);
        System.out.println(st2.rollNo);
        System.out.println(st3.rollNo);
        System.out.println(st4.rollNo);
    }
}
