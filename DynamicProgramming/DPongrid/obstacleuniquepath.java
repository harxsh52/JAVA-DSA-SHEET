package DynamicProgramming.DPongrid;

public class obstacleuniquepath {
    public int uniquePathsWithObstacles(int[][]g) {
        int[][] dp=new int[g.length][g[0].length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }
                int up=0;
                if(i>0){
                    up=dp[i-1][j];
                }
                int left=0;
                if(j>0){
                    left=dp[i][j-1];
                }
                dp[i][j]=up+left;
            }
        }
        return dp[g.length-1][g[0].length-1];
    }
}
