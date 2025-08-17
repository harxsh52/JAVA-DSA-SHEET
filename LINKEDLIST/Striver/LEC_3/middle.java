package LINKEDLIST.Striver.LEC_3;

public class middle {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode s1=head;
        ListNode s2=head;
        while(s1!=null && s1.next!=null){
            s1=s1.next.next;
            s2=s2.next;
        }
        return s2;
    }
}
