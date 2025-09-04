package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergred_interval {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();
        int[] interval=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(interval[1]>=intervals[i][0]){
                interval[1]=Math.max(interval[1],intervals[i][1]);
            }else{
                list.add(interval);
                interval=intervals[i];
            }
        }
        list.add(interval);
        return list.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        mergred_interval obj=new mergred_interval();
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][] result=obj.merge(intervals);
        for(int[] arr:result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
