package DynamicProgramming.easy;

public class frogjump {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int onejump=dp[i-1]+Math.abs(height[i]-height[i-1]);
            int secondjump=Integer.MAX_VALUE;
            if(i>1){
                secondjump=dp[i-2]+Math.abs(height[i]-height[i-2]);
            }
            dp[i]=Math.min(onejump,secondjump);
        }
        return dp[n-1];
    }
}
