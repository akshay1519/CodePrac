package practice.linkedlist;

public class LinkedListOperation {
    public static ListNode head = null;
    public static void main(String[] args) {
        head = new ListNode(10);
        System.out.println(listSize());
        insert_node(1,4998);insert_node(2,6629);insert_node(3,7976);insert_node(4,1445);insert_node(5,6573);insert_node(6,6416);insert_node(7,2528);insert_node(8,6208);insert_node(9,7871);insert_node(10,8738);insert_node(11,9468);insert_node(12,7983);insert_node(13,6477);insert_node(14,1214);insert_node(15,8468);insert_node(16,4793);insert_node(17,5687);insert_node(18,7074);insert_node(19,430);insert_node(20,3310);insert_node(21,4005);insert_node(22,3848);insert_node(23,6598);insert_node(24,2184);insert_node(25,5350);insert_node(26,201);insert_node(27,952);insert_node(28,2842);insert_node(29,3564);insert_node(30,8239);insert_node(31,6513);insert_node(32,6310);insert_node(33,2195);insert_node(34,4645);insert_node(35,4237);insert_node(36,4763);insert_node(37,3786);insert_node(38,1331);insert_node(39,644);insert_node(40,7022);insert_node(41,4055);insert_node(42,5940);insert_node(43,7777);insert_node(44,9343);insert_node(45,5284);insert_node(46,7284);insert_node(47,9061);insert_node(48,6201);insert_node(49,4987);insert_node(50,3808);insert_node(51,8755);insert_node(52,6335);insert_node(53,2478);insert_node(54,8615);insert_node(55,4455);insert_node(56,4466);insert_node(57,4290);insert_node(58,7744);insert_node(59,5193);insert_node(60,2801);insert_node(61,3705);insert_node(62,8208);insert_node(63,7357);insert_node(64,785);insert_node(65,9765);insert_node(66,7857);insert_node(67,5365);insert_node(68,5535);insert_node(69,9190);insert_node(70,8728);insert_node(71,4598);insert_node(72,242);insert_node(73,8917);insert_node(74,9501);insert_node(75,6524);insert_node(76,6305);insert_node(77,5566);insert_node(78,7105);insert_node(79,3865);insert_node(80,9204);insert_node(81,6068);insert_node(82,6423);insert_node(83,2371);insert_node(84,3519);insert_node(85,4510);insert_node(86,5354);insert_node(87,9899);insert_node(88,407);insert_node(89,530);insert_node(90,9102);insert_node(91,8426);insert_node(92,3926);insert_node(93,686);insert_node(94,8645);insert_node(95,2445);insert_node(96,2226);insert_node(97,5199);insert_node(98,1892);insert_node(99,5012);insert_node(100,9844);insert_node(24,7114);
        print_ll();
        delete_node(5);
        print_ll();
    }
    public static void insert_node(int position, int value) {
        ListNode newListNode = new ListNode(value);
        if(position==1){
            if(head != null){
                newListNode.next=head;
            }
            head= newListNode;
            return;
        }else {
            ListNode temp = head;
            while (temp!=null && position-->2){
                temp = temp.next;
            }
                newListNode.next = temp.next;
                temp.next = newListNode;
        }
    }
    public static void delete_node(int position) {
        int size = listSize();
            if (size <= 1) {
                head = null;
            } else {
                ListNode temp = head;
                while (temp!=null && position-- > 2) {
                    temp = temp.next;
                }
                if (temp != null && temp.next != null) {
                    temp.next = temp.next.next;
                }
            }
    }
    public static void print_ll() {
        int size = listSize();
        ListNode temp = head;
        while (size-->1){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.print(temp.val +"\n");
    }
    public static int listSize(){
        ListNode currListNode = head;
        if(currListNode ==null)
            return  0;
        else {
            int count = 0;
            while (currListNode !=null){
                count++;
                currListNode = currListNode.next;
            }
            return count;
        }
    }
}
