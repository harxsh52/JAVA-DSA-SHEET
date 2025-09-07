package Heap.Hard;

import java.util.PriorityQueue;

public class kthLargest {
    class KthLargest {
    private int k;
    private PriorityQueue<Integer> pq=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){
            pq.offer(i);
        }
        while(pq.size()>k){
            pq.remove();
        }

    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()>k){
            pq.remove();
        }
        return pq.peek();
    }
}
}
