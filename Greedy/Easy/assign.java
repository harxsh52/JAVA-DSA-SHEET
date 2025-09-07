package Greedy.Easy;

import java.util.Arrays;

public class assign {
    public int findContentChildren(int[] g, int[] s) {
        int i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        if(s.length==0 || g.length==0)return 0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}
