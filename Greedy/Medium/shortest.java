package Greedy.Medium;

import java.util.Arrays;

public class shortest {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int waittime=0;
        int totaltime=0;
        for(int i:bt){
            waittime+=totaltime;
            totaltime+=i;
        }
        return waittime/bt.length;
    }
}
