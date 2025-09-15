package DynamicProgramming.DPongrid;

public class fallingpathsum {
    public int minPathSum(int[][] g) {
        int[][] dp=new int[g.length][g[0].length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=g[i][j];
                }else{
                    int up=Integer.MAX_VALUE;
                    if(i>0){
                        up=dp[i-1][j];
                    }
                    int left=Integer.MAX_VALUE;
                    if(j>0){
                        left=dp[i][j-1];
                    }
                    dp[i][j]=g[i][j]+Math.min(up,left);
                }
            }
        }
        return dp[g.length-1][g[0].length-1];
    }
}
