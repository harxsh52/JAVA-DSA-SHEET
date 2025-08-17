package LINKEDLIST.Striver.LEC_3;

public class even_odd {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode odd=head,oddHead=odd;
        ListNode even=head.next,evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
