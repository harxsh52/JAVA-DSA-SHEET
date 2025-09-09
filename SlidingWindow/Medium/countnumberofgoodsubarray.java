package SlidingWindow.Medium;

public class countnumberofgoodsubarray {
    public int numberOfSubarrays(int[] nums, int k) {
        if(k==0){
            return countAtmost(nums,0);
        }
        return countAtmost(nums,k)-countAtmost(nums,k-1);
    }
    public int countAtmost(int[] nums,int k){
        int left=0;
        int count=0;
        int max=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1){
                count++;
            }
            while(count>k){
                if(nums[left]%2==1){
                    count--;
                }
                left++;
            }
            max+=right-left+1;
        }
        return max;
    }
}
