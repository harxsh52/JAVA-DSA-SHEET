package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        two_sum obj=new two_sum();
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=obj.twoSum(nums,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
