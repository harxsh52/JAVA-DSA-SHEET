package Bianrysearch.Medium;

public class sqrt {
    int floorSqrt(int n) {
        // code here
        int low=0;
        int high=n;
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid<=n){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}
