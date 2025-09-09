package Bianrysearch.easy;

public class singleelement {
    public int singleNonDuplicate(int[] nums) {
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                mid-=1;
            }
            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
}
