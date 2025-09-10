package Bianrysearch.Medium;

public class splitarraysum {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0,ans=-1;
        for(int i:nums){
            low=Math.max(i,low);
            high+=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,k,mid)){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] nums,int k,int mid){
        int count=1;
        int total=0;
        for(int i:nums){
            if(total+i>mid){
                count++;
                total=0;
            }
            total+=i;
        }
        return count<=k;
    }
}
