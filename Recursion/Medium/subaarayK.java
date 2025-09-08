package Medium;

public class subaarayK {
    private int count;

    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        count = 0;
        generate(nums, k, 0, 0);
        return count;
    }
    private void generate(int[] nums, int k, int index, int currentSum) {

        if (index == nums.length) {
            if (currentSum == k) {
                count++;
            }
            return;
        }
        generate(nums, k, index + 1, currentSum + nums[index]);
        generate(nums, k, index + 1, currentSum);
    }
}
