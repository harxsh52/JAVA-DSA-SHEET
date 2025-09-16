package DynamicProgramming.DPonsubsequence;

public class subsetsum {
    class Solution {
    static boolean isSubsetSum(int[] arr, int sum) {
        int n=arr.length;
        boolean[][] dp=new boolean[arr.length+1][sum+1];
        for(int i=0;i<=arr.length;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=arr[i-1]){
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[n][sum];
    }
}

}
