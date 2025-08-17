package LINKEDLIST.Striver.LEC_3;

import LINKEDLIST.Striver.LEC_3.middle.ListNode;

public class reverse_ {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode reverseList(ListNode head) {
       if(head==null)return head;
       ListNode prev=null;
       ListNode curr=head;
       while(curr!=null){
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
       }
       return prev;
    }
}
