public class checksorted {
    public boolean check(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                t++;
            }
        }
        return t>1?false:true;
    }
    public static void main(String[] args) {
        checksorted obj = new checksorted();
        int[] arr = {3,4,5,1,2};
        System.out.println("Is the array sorted and rotated? " + obj.check(arr));
    }
}
