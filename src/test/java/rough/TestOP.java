package rough;

import com.google.common.base.Predicate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.time.LocalDate;
import java.util.*;

public class TestOP {
    public void foo()
    {
        assert false; /* Line 5 */
        assert false; /* Line 6 */
    }
    public void bar()
    {
        while(true)
        {
            assert false; /* Line 12 */
        }
//        assert false;  /* Line 14 */
    }
    public static int y;
    public static void foo(int x)
    {
        System.out.print("foo ");
        y = x;
    }
    public static int bar(int z)
    {
        System.out.print("bar ");
        return y = z;
    }
    Object message() {
        return "Hello!";
    }
    static int count = 0;
    private volatile boolean base = true;
    public void main(String[] args) {
        double value = -9.0;
        System.out.println(Math.sqrt(value));

//        AbstractButton groucyButton = null;
        int t = 0;
        assert t > 0 : bar(7);
//        assert t > 1 : foo(8); /* Line 18 */
        System.out.println("done ");
//        groucyButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Press me one more time..");
//            }
//        });
//        Object event;
//        groucyButton.addActionListener((event) -> System.out.println("Press One mOre TIme") );
//
//        this.getClass().getSimpleName();
//        this.getClass().getDeclaredMethods();
//
//        Predicate<String> predicate = (String a) -> false;
//        String message = "Hello world!";
//        String newMessage = message.substring(6, 12)
//                + message.substring(5, 6);
//        System.out.println(newMessage);
//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mike", "Tom", "Glen"));
////        names.sort(List.);
//        System.out.println(names);
//        ;
////        List list = new ArrayList();
////        list.add("hello");
////        list.add(2);
////        System.out.println(LocalDate.now());
////        System.out.print(list.get(0) instanceof Object);
////        System.out.print(list.get(1) instanceof Integer);
//        System.out.println();
//        System.out.print("fucumber".compareTo("banana"));
//        System.out.println();
//        List<Boolean> list = new ArrayList<>();
//        list.add(true);
//        list.add(false);
//        list.add(Boolean.TRUE);
//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.toString());
//            it.next();
//        }
//        new MagicPower().castSpell("Petroleum");
//        MagicPower magicPower = new MagicPower(); magicPower.castSpell("Default");
//        int x=5,y=10;
//        swapsies(x,y);
//        System.out.println(x+" "+y);
//        System.out.print(list.size());
//        System.out.print(list.get(1) instanceof Boolean);
//        if (count < 3) {
//            count++;
//            main(null);
//        } else {
//            return;
//        }
//        System.out.println("Hello World!");

//        try {
//            System.out.println("A");
//            badMethod();
//            System.out.println("B");
//        } catch (Exception ex) {
//            System.out.println("C");
//        } finally {
//            System.out.println("D");
//        }
//        System.out.println(new TestOP().message());
//        System.out.println(new Main5().message());
    }
    public static void badMethod() throws Exception {
        throw new Error();
    }
    static void swapsies(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
    }
}
    class Main5 extends TestOP {
        String message() {
            return "World";
        }
    }
 class MagicPower {
    void castSpell(String spell) {}
}


