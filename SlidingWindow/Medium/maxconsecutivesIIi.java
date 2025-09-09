package SlidingWindow.Medium;

public class maxconsecutivesIIi {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int maxLength=0;
        while(right<nums.length){
            if(nums[right]==0){
                k--;
            }
            right++;
            while(k<0){
                if(nums[left]==0){
                    k++;
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left);
        }
        return maxLength;
    }
}
