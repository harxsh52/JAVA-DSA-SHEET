package Bianrysearch.Medium;

public class capacityship {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int ans=-1;
        for(int t:weights){
            low=Math.max(low,t);
            high+=t;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean check(int[] num,int Day,int mid){
        int t=0;
        int day=1;
        for(int y:num){
            if(t+y>mid){
                day++;
                t=0;
            }
            t+=y;
        }
        return day<=Day;
    }
}
