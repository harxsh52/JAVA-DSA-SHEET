package Greedy.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {
     public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> merged=new ArrayList<>();
        int[] interval=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=interval[1]){
                interval[1]=Math.max(interval[1],intervals[i][1]);

            }else{
                merged.add(interval);
                interval=intervals[i];
            }
        }
        merged.add(interval);
        return merged.toArray(new int[0][]);
    }
}
