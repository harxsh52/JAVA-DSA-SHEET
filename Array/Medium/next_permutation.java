package Array.Medium;

public class next_permutation {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0 && nums[i-1]>=nums[i]){
            i--;
        }
        if(i==0){
            reverse(nums,0,nums.length-1);
            return;
        }
        int j=nums.length-1;
        while(j>=i && nums[j]<=nums[i-1]){
            j--;
        }
        swap(nums, i-1, j);
        reverse(nums, i, nums.length-1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        next_permutation obj = new next_permutation();
        int[] nums = {1,2,3};
        obj.nextPermutation(nums);
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
