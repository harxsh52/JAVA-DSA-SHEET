public class remove_duplicate {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int q=0;
        for(int i=1;i<nums.length;i++){
            if(nums[q]!=nums[i]){
                q++;
                nums[q]=nums[i];

            }
        }
        return q+1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2};
        remove_duplicate obj=new remove_duplicate();
        System.out.println(obj.removeDuplicates(arr));
    }
}
