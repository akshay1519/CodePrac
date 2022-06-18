package practice.linkedlist;

import java.util.ArrayList;

public class DesignLinkedList {
    class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
    ListNode head;
    public static void main(String[] args) {



    }
    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
        for (int i=0;i< A.size();i++){
            if(A.get(i).get(0) == 0){
                int val = A.get(i).get(1);
                addNodeAtFirst(val);
            }else if(A.get(i).get(0) == 1){
                int val = A.get(i).get(1);
                addNodeAtLast(val);
            }else if(A.get(i).get(0) == 2){
                int val = A.get(i).get(1);
                int pos = A.get(i).get(2);
                addNodeAtPos(val,pos);
            }else  if(A.get(i).get(0)==3){
                int pos = A.get(i).get(1);
                delNodeAtPos(pos);
            }
        }
        return head;
    }

    private void delNodeAtPos(int pos) {
        if (head == null){
            return;
        }else if(pos==0 && head!=null){
            head = head.next;
        }else {
            ListNode curr = head;
            while (pos-->1 && curr.next!=null){
                curr = curr.next;
            }
            if(curr.next!=null){
                curr.next = curr.next.next;
            }
        }
    }

    private void addNodeAtPos(int val, int pos) {
        if(pos ==0){
            addNodeAtFirst(val);
        }else {
            ListNode temp = new ListNode(val);
            ListNode curr = head;
            while (pos-->1 && curr.next!=null){
                curr = curr.next;
            }
            if(pos>1){
                curr.next = temp;
            }else {
                temp.next = curr.next;
                curr.next = temp;
            }
        }

    }

    private void addNodeAtLast(int val) {
        if(head==null){
            addNodeAtFirst(val);
        }else {
            ListNode temp = new ListNode(val);
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    private void addNodeAtFirst(int val) {
        ListNode temp = new ListNode(val);
        if(head==null){
            head = temp;
        }else {
            temp.next = head;
            head = temp;
        }
    }
}
