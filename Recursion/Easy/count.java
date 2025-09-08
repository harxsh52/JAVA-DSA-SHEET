package Recursion.Easy;

public class count {
    static final int MOD=1000000007;
    public int countGoodNumbers(long n) {
        long evenways=(n+1)/2;
        long oddways=(n)/2;
        long e=fast(evenways,5);
        long o=fast(oddways,4);
        return (int)((e*o)%MOD);


    }
    public long fast(long x,long r){
        long result=1;
        while(x>0){
            if(x%2!=0){
                result=(result*r)%MOD;
            }
            r=(r*r)%MOD;
            x>>=1;
        }
        return result;
    }
}
