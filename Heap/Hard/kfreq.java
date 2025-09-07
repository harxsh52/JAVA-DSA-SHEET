package Heap.Hard;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class kfreq {
    class Pair implements Comparable<Pair>{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Pair s){
            return s.y-this.y;
            }
        }
    
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length<k)return new int[]{-1};
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.remove().x;
        }
        return arr;
    }
}
