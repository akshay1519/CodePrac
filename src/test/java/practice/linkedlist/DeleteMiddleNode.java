package practice.linkedlist;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(3);
//        listNode.next.next.next =  new ListNode(4);
//        listNode.next.next.next.next = new ListNode(5);
//        listNode.next.next.next.next.next = new ListNode(6);
        solve(listNode);
        print(listNode);

    }
    public static ListNode solve(ListNode A) {
        if (A==null){
            return null;
        }
        ListNode fast = A;
        ListNode slow = A;
        ListNode curr = A;
        while (fast != null && fast.next!=null){
            fast = fast.next.next;
            curr = slow;
            slow = slow.next;
        }
        if (curr.next == null) {
            return null;
        }
        curr.next = curr.next.next;
        return A;

    }
    public static void print(ListNode A){
        ListNode temp = A;
        while (temp != null){
            System.out.println(A.val);
            temp = temp.next;
        }
    }
}
