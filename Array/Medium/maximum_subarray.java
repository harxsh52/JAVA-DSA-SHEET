package Array.Medium;

public class maximum_subarray {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            sum+=i;
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        maximum_subarray msa=new maximum_subarray();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(msa.maxSubArray(nums));
    }
}
