package Heap.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class median {
        public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> medians = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // For the lower half
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // For the upper half

        for (int num : arr) {
            // Add the number and balance the heaps
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());

            if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }

            // Calculate the current median
            if (maxHeap.size() > minHeap.size()) {
                medians.add((double) maxHeap.peek());
            } else {
                medians.add((maxHeap.peek() + minHeap.peek()) / 2.0);
            }
        }
        
        return medians;
    }
}
