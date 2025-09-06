package Heap.Easy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Klargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        while(k>1){
            pq.remove();
            k--;
        }
        return pq.peek();
    }
}
