package Array.Medium;

import java.util.ArrayList;

public class maximum_subarrayII {
    public ArrayList<Integer> findSubarray(int arr[]) {
        long max_sum = -1;        // Initialize maximum sum
        long cur_sum = 0;         // Initialize current sum
        int max_range_left = -1;  // Initialize maximum range left
        int max_range_right = -1; // Initialize maximum range right
        int cur_range_left = 0;   // Initialize current range left
        int cur_range_right = 0;  // Initialize current range right
        int n = arr.length;       // Get the size of the array

        while (cur_range_right < n) {
            if (arr[cur_range_right] < 0) {
                cur_range_left = cur_range_right + 1; // Move left pointer
                cur_sum = 0;                          // Reset current sum
            } else {
                cur_sum +=
                    (long)arr[cur_range_right]; // Add current element to current sum
                if (cur_sum > max_sum) {
                    // Update maximum sum and range
                    max_sum = cur_sum;
                    max_range_left = cur_range_left;
                    max_range_right = cur_range_right;
                } else if (cur_sum == max_sum) {
                    if (cur_range_right + 1 - cur_range_left >
                        max_range_right + 1 - max_range_left) {
                        // Update range if equal sum but longer range
                        max_range_left = cur_range_left;
                        max_range_right = cur_range_right;
                    }
                }
            }
            cur_range_right++; // Move right pointer
        }

        ArrayList<Integer> ans = new ArrayList<>(); // Initialize ArrayList for answer

        if (max_range_left == -1 || max_range_right == -1) {
            ans.add(-1); // If no valid range found, add -1 to answer and return
            return ans;
        }

        for (int i = max_range_left; i <= max_range_right; ++i)
            ans.add(arr[i]); // Add elements within maximum range to answer

        return ans; // Return the final answer
    }
}
