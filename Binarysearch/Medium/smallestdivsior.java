package Bianrysearch.Medium;

public class smallestdivsior {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,ans=-1;
        int high=getMax(nums);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,threshold,mid)){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int getMax(int[] nums){
        int high=0;
        for(int m:nums){
            high=Math.max(high,m);
        }
        return high;
    }
    public boolean check(int[] nums,int threshold,int m){
        int t=0;
        for(int n:nums){
            t+=(n-1+m)/m;
        }
        return t<=threshold;
    }
}
