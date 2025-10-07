public class removeduplicate {
    public int removeDuplicates(int[] nums) {
        int q=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[q]){
                continue;
            }
            q++;
            nums[q]=nums[i];

        }
        return q+1;
    }
}
