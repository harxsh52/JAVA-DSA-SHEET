package DynamicProgramming.DPongrid;

public class ninjatrainging {
    public int maximumPoints(int arr[][]) {
        int N = arr.length;
        // Creating a 2D array to store dynamic programming values
        int[][] dp = new int[N + 1][4];

        // Filling the dp array with -1 values
        for (int i = 0; i < N + 1; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Iterating through the points array
        for (int i = 0; i < N; i++) {
            // Setting initial values for the first row of dp array
            if (i == 0) {
                dp[i][1] = arr[i][0];
                dp[i][2] = arr[i][1];
                dp[i][3] = arr[i][2];
                continue;
            }

            // Calculating the maximum points for each row
            dp[i][1] = Math.max(dp[i - 1][2], dp[i - 1][3]) + arr[i][0];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][3]) + arr[i][1];
            dp[i][3] = Math.max(dp[i - 1][1], dp[i - 1][2]) + arr[i][2];
        }

        int ans = 0;
        // Finding the maximum points from the last row of dp array
        ans = Math.max(ans, dp[N - 1][1]);
        ans = Math.max(ans, dp[N - 1][2]);
        ans = Math.max(ans, dp[N - 1][3]);

        // Return the maximum points
        return ans;
    }
