package Medium;

public class checksubarraysum {
     public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // Our memoization table. We use Boolean to store three states:
        // null (not computed), true, and false.
        Boolean[][] memo = new Boolean[N][K + 1];
        
        // Start the recursive process from the first element (index 0)
        // with the full target sum K.
        return generate(0, K, N, arr, memo);
    }

    /**
     * @param index  The current index in the array we are considering.
     * @param target The remaining sum we need to achieve.
     * @param N      The total number of elements in the array.
     * @param arr    The input array.
     * @param memo   The memoization table to store results of subproblems.
     * @return       True if a valid subsequence is found, otherwise false.
     */
    private static boolean generate(int index, int target, int N, int[] arr, Boolean[][] memo) {
        // Base Case 1: Success. We've found a combination that sums exactly to the original K.
        if (target == 0) {
            return true;
        }

        // Base Case 2: Failure. We've run out of elements or the sum has become negative.
        if (index == N || target < 0) {
            return false;
        }

        // 1. CHECK CACHE: If we have already solved this subproblem, return the stored result.
        if (memo[index][target] != null) {
            return memo[index][target];
        }

        // --- Recursive Step ---

        // Choice 1: Pick the current element arr[index].
        // Subtract it from the target and move to the next index.
        boolean pick = generate(index + 1, target - arr[index], N, arr, memo);

        // Choice 2: Do NOT pick the current element arr[index].
        // Target remains the same, move to the next index.
        boolean notPick = generate(index + 1, target, N, arr, memo);

        // 2. STORE RESULT: Store the result of (pick || notPick) in the cache before returning.
        memo[index][target] = pick || notPick;
        
        return memo[index][target];
    }
}
