public class nroot {
    final int MOD=1000000007;
    public int nthRoot(int n, int m) {
        // code here
        int low=0;
        int high=m;
        long h=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            long r=f(mid,n);
            if(r==h){
                return mid;
            }
            else if(r<h){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
        
    }
    public  long f(int r,int n){
        long res=1;
        while(n>0){
            if(n%2!=0){
                res=(res*r)%MOD;
            }
            r=(r*r)%MOD;
            n>>=1;
        }
        return res;
    }
}
