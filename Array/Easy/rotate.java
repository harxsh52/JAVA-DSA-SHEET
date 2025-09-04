public class rotate {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return ;
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return ;
    }
    public static void main(String[] args) {
        rotate obj = new rotate();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        obj.rotate(nums,k);
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
