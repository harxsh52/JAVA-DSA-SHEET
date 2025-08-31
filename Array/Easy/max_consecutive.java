public class max_consecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        return max;
    }
    public static void main(String[] args) {
        max_consecutive obj = new max_consecutive();
        int[] nums = {1,1,0,1,1,1};
        System.out.println(obj.findMaxConsecutiveOnes(nums)); // Output: 3
    }
}
