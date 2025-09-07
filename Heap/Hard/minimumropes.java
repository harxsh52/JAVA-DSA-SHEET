package Heap.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class minimumropes {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr){
            pq.offer(i);
        }
        List<Integer> list=new ArrayList<>();
        while(pq.size()>1){
            int m1=pq.remove();
            int m2=pq.remove();
            list.add(m1+m2);
            pq.offer(m1+m2);
        }
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        return sum;
    }
}
