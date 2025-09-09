package Bianrysearch.Medium;

public class kokobanana {
    public int minEatingSpeed(int[] piles, int h) {
        long low=1;
        long ans=-1;
        long high=getMax(piles);
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canEatall(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
    private boolean canEatall(int[] piles,int h,long k){
        long t=0;
        for(int pile:piles){
            t+=(pile-1+k)/k;

        }
        return t<=h;
    }
    private int getMax(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int pile:piles){
            max=Math.max(max,pile);
        }
        return max;
    }
}
