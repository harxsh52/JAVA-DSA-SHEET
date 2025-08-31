package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class subarraysum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                cnt+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        subarraysum obj=new subarraysum();
        int[] nums={1,1,1};
        int k=2;
        System.out.println(obj.subarraySum(nums, k));
    }
}
