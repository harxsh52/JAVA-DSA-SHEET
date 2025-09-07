package Greedy.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class meetings {
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<int[]> people=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            people.add(new int[]{start[i],end[i]});
        }
        Collections.sort(people,(a,b)->a[1]-b[1]);
        int count=1;
        int last=people.get(0)[1];
        for(int i=1;i<people.size();i++){
            if(people.get(i)[0]>last){
                count++;
                last=people.get(i)[1];
            }
        }
        return count;
    }
}
