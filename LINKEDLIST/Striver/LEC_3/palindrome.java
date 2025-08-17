package LINKEDLIST.Striver.LEC_3;

public class palindrome {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null)return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode dummy=head;
        while(prev!=null){
            if(prev.val!=dummy.val){
                return false;
            }
            prev=prev.next;
            dummy=dummy.next;
        }
        return true;
    }
}
