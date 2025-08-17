package LINKEDLIST.Striver.LEC_3;

public class cycleII_ {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                ListNode entry=head;
                while(entry!=slow){
                    slow=slow.next;
                    entry=entry.next;
                }
                return slow;
            }
        }
        return null;
    }
}
