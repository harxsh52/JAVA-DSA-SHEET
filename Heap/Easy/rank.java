package Heap.Easy;
import java.util.HashMap;
import java.util.PriorityQueue;
public class rank {
    static int[] replaceWithRank(int arr[], int N) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.offer(num);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        while (!pq.isEmpty()) {
            int currentNum = pq.poll();
            if (!map.containsKey(currentNum)) {
                map.put(currentNum, rank);
                rank++;
            }
        }

        for (int i = 0; i < N; i++) {
            arr[i] = map.get(arr[i]);
        }
        
        return arr;
    }
}
