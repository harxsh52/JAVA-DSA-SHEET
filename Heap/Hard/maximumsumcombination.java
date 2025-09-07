package Heap.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class maximumsumcombination {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
    Arrays.sort(a);
        Arrays.sort(b);
        int n=a.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((e,r)->r[0]-e[0]);
        HashSet<String> set=new HashSet<>();
        int sum=a[n-1]+b[n-1];
        
        pq.offer(new int[]{sum,n-1,n-1});
        set.add((n-1)+"'"+(n-1));
        ArrayList<Integer> result=new ArrayList<>();
        for(int c=0;c<k;c++){
            int[] current=pq.poll();
            int Sum=current[0];
            int i=current[1];
            int j=current[2];
            
            result.add(Sum);
            if(i>0 && !set.contains((i-1)+"'"+(j))){
                pq.offer(new int[]{a[i-1]+b[j],i-1,j});
                set.add((i-1)+"'"+j);
            }
            if(j>0 && !set.contains(i+"'"+(j-1))){
                pq.offer(new int[]{a[i]+b[j-1],i,j-1});
                set.add(i+"'"+(j-1));
            }
        }
        return result;
        
    }
}
