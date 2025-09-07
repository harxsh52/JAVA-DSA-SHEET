package Heap.Medium;

import java.util.PriorityQueue;

public class sort {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
        public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(ListNode l:lists){
            while(l!=null){
                pq.add(l.val);
                l=l.next;
            }
        }
        if(pq.size()==0)return null;
        ListNode head=new ListNode(pq.poll());
        ListNode current=head;
        while(!pq.isEmpty()){
            current.next=new ListNode(pq.poll());
            current=current.next;
        }
        return head;
    }
}
