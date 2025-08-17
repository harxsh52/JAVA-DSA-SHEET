package LINKEDLIST.Striver.LEC_2;

public class reverse_dl {
    static class DLLNode{
        int data;
        DLLNode next,prev;
        DLLNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head==null || head.next==null){
            return head;
        }
        DLLNode prev=null;
        DLLNode current=head;
        while(current!=null){
            prev=current.prev;
            current.prev=current.next;
            current.next=prev;
            current=current.prev;
        }
        return prev.prev;
    }
}
