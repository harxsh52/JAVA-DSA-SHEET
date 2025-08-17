package LINKEDLIST.Striver.LEC_3;

import org.w3c.dom.Node;

public class length_loop {
    static class Node {
        int val;
        Node next;
        Node(int x) { val = x; this.next = null; }
    }
    public int lengthOfLoop(Node head) {
        // code here.
        Node fast=head;
        Node slow=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=fast.next;
                count=1;
                while(fast!=slow){
                    count++;
                    fast=fast.next;
                }
                return count;
            }
        }
        return count;
}
}
