package Array.Medium;

import java.util.ArrayList;

public class rearrange_sign {
        public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i:nums){
            if(i>=0){
                pos.add(i);
            }else{
                neg.add(i);
            }
        }
        int p=0,q=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos.get(p++);
            }else{
                nums[i]=neg.get(q++);
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        rearrange_sign obj=new rearrange_sign();
        int[] nums={3,1,-2,-5,2,-4};
        int[] ans=obj.rearrangeArray(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
