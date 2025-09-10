package Bianrysearch.Medium;

public class painterpartition {
    public int minTime(int[] arr, int k) {
        // code here
        int low=0;
        int high=0,ans=-1;
        for(int i:arr){
            low=Math.max(i,low);
            high+=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,mid,k)){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] arr,int mid,int k){
        int count=1;
        int total=0;
        for(int i:arr){
            if(total+i>mid){
                total=0;
                count++;
            }
            total+=i;
        }
        return count<=k;
    }
}
