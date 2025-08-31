public class missing {
    public int missingNumber(int[] nums) {
        int mis=0;
        for(int i=1;i<=nums.length;i++){
            mis^=i;
        }
        for(int i:nums){
            mis^=i;
        }
        return mis;
    }
    public static void main(String[] args) {
        missing obj=new missing();
        int[] nums={3,0,1};
        int result=obj.missingNumber(nums);
        System.out.println(result);
    }
}
