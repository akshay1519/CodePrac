package practice.linkedlist;

public class RemoveLoopFromLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next =  new ListNode(5);
        listNode.next.next.next.next =  new ListNode(6);
        listNode.next.next.next.next.next = listNode.next.next;
        solve(listNode);
    }
    public static ListNode solve(ListNode A) {
        if(A == null || A.next == null){
            return null;
        }
        ListNode sp = A;
        ListNode fp = A;
        boolean loop = false;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp){
                loop = true;
                break;
            }
        }
        if(!loop){
            return A;
        }
        sp = A;
        while(sp != fp){
            if(sp.next == fp.next){
                fp.next = null;
                break;
            }
            sp = sp.next;
            fp = fp.next;

        }
        return A;
    }
}
