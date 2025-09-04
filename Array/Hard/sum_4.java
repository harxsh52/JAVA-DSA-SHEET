package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sum_4 {
        public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<target){
                    left++;
                }else{
                    right--;
                }
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        sum_4 obj=new sum_4();
        int[] arr={1,0,-1,0,-2,2};
        int target=0;
        System.out.println(obj.fourSum(arr,target));
    }
}
