import java.util.HashMap;

public class subarray_sumk {
    public int longestSubarray(int[] arr, int k) {
        // HashMap to store (sum, index) pairs
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        // Traverse the given array
        for (int i = 0; i < arr.length; i++) {
            // Accumulate sum
            sum += arr[i];

            // When subarray starts from index 0
            if (sum == k) {
                maxLen = i + 1;
            }

            // If 'sum' is not present in the map, add it with the index 'i'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // Check if 'sum - k' is present in the map or not
            if (map.containsKey(sum - k)) {
                // Update maxLength if needed
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
        }

        // Return the required maximum length
        return maxLen;
    }
    public static void main(String[] args) {
        subarray_sumk obj = new subarray_sumk();
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(obj.longestSubarray(arr, k)); // Output: 4
    }
}
