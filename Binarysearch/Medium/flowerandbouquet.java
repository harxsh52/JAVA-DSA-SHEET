package Bianrysearch.Medium;

public class flowerandbouquet {
    public int minDays(int[] bloomDay, int m, int k) {
        if((m*k)>bloomDay.length)return -1;
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int L:bloomDay){
            low=Math.min(low,L);
            high=Math.max(high,L);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMake(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean canMake(int[] num,int m,int k,int mid){
        int b=0;
        int f=0;
        for(int day:num){
            if(day<=mid){
                f++;
                if(f==k){
                    b++;
                    f=0;
                }
            }else{
                f=0;
            }
        }
        return b>=m;
    }
}
