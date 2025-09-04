package Array.Hard;

import java.util.ArrayList;

public class reverse_pair {
    class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    public void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
        return ;
    }
    public int countpairs(int[] arr,int low,int mid,int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            // Inside the countpairs function
while(right <= high && (long)arr[i] > 2L * arr[right]) right++;
            cnt+=(right-mid-1);
        }
        return cnt;
    }
    public int mergesort(int[] nums,int low,int high){
        int cnt=0;
        if(low<high){
            int mid=low+(high-low)/2;
            cnt+=mergesort(nums,low,mid);
            cnt+=mergesort(nums,mid+1,high);
            cnt+=countpairs(nums,low,mid,high);
            merge(nums,low,mid,high);
        }
        return cnt;
    }
}
}
