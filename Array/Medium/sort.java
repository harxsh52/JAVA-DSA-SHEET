package Array.Medium;

public class sort {
    public void sortColors(int[] nums) {
    int low = 0, mid = 0, high = nums.length - 1;
    while (mid <= high) {
        if (nums[mid] == 0) {
            int tmp = nums[low];
            nums[low++] = nums[mid];
            nums[mid++] = tmp;
        } else if (nums[mid] == 1) {
            mid++;
        } else {
            int tmp = nums[mid];
            nums[mid] = nums[high];
            nums[high--] = tmp;
        }
    }
}
public static void main(String[] args) {
    sort s = new sort();
    int[] nums = {2,0,2,1,1,0};
    s.sortColors(nums);
    for(int num : nums) {
        System.out.print(num + " ");
}
}}
