package Greedy.Medium;

import java.util.Arrays;

public class nonoverlapping {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b) ->Integer.compare(a[0],b[0]));
        int[] in= intervals[0];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(in[1]>intervals[i][0]){
                in[1]=Math.min(intervals[i][1],in[1]);
                count++;
            }else{
                in=intervals[i];
            }
        }
        return count;
    }
}
