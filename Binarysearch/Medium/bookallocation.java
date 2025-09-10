package Bianrysearch.Medium;

public class bookallocation {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)return -1;
        int low=0,ans=0;
        int high=0;
        for(int i:arr){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] arr,int k,int mid){
        int total=0;
        int count=1;
        for(int i:arr){
            if(total+i>mid){
                count++;
                total=0;
            }
            total+=i;
        }
        return count<=k;
    }
}
