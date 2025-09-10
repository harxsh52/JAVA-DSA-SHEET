package Bianrysearch.Medium;

import java.util.Arrays;

public class agrresivecow {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low=1;
        int high=Math.abs(stalls[stalls.length-1]-stalls[0]);
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPalaceCows(stalls,k,mid)){
                ans=mid;
               low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public boolean canPalaceCows(int[] stalls,int k,int mid){
        int count=1;
        int prev=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-prev>=mid){
                count++;
                prev=stalls[i];
            }
            
        }
        return count>=k;
        
    }
}
