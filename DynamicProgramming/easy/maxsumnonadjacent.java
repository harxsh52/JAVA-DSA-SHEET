package DynamicProgramming.easy;

public class maxsumnonadjacent {
    int findMaxSum(int arr[]) {
        // code here
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[arr.length-1];
    }
}
