package DynamicProgramming.easy;

public class houserobberII {
    public int rob(int[] nums) {
         if(nums.length==0)return 0;
        else if(nums.length==1)return nums[0];
        else if(nums.length==2)return Math.max(nums[0],nums[1]);
        int x=roob(nums,0,nums.length-1);
        int y=roob(nums,1,nums.length);
        return Math.max(x,y);
    }
    public int roob(int[] nums,int i,int e){
        int[] dp=new int[e];
        if((i-e)==0){
            return 0;
        }
        if((i-e)==1){
            return nums[0];
        }
        dp[i]=nums[i];
        dp[i+1]=Math.max(nums[i],nums[i+1]);
        for(int j=2;j<e;j++){
            dp[j]=Math.max(dp[j-1],dp[j-2]+nums[j]);
        }
        return dp[e-1];
    }
}
