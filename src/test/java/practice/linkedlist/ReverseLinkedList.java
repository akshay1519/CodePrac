package practice.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next =  new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        reverseList(listNode);
        print(listNode);
    }
    public static ListNode reverseList(ListNode A) {
        if (A==null){
            return A;
        }
        ListNode prev = null;
        ListNode curr = A;
        ListNode next = null;
        while (curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void print(ListNode A){
        ListNode temp = A;
        while (temp != null){
            System.out.println(A.val);
            temp = temp.next;
        }
    }
}
