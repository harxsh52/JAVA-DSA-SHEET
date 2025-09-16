package DynamicProgramming.DPonsubsequence;

public class count_perfectsum {
    public int perfectSum(int[] nums, int target) {
        // code here
        int[][] dp=new int[nums.length+1][target+1];
        for(int i=0;i<=nums.length;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<=target;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=nums[i-1]){
                    dp[i][j]+=dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[nums.length][target];
    }
}
