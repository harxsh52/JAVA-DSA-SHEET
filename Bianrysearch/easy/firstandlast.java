package Bianrysearch.easy;

public class firstandlast {
    public int[] searchRange(int[] nums, int target) {
        int q=floor(nums,target);
        int w=ceil(nums,target);
        return new int[] {q,w};
    }
    public int floor(int[] nums,int target){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
            }
            if(nums[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int ceil(int[] nums,int target){
        int low=0;
        int ans=-1;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
            }
            if(nums[mid]<=target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
