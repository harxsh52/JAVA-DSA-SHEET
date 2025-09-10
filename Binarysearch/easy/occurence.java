package Bianrysearch.easy;

public class occurence {
    int countFreq(int[] arr, int target) {
        // code here
        int q=floor(arr,target);
        int w=ceil(arr,target);
        if(q==-1 && w==-1){
            return 0;
        }
        return -q+w+1;
    }
    int floor(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
            }
            if(arr[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    int ceil(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
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
