package SlidingWindow.Medium;

import java.util.HashMap;

public class subarraywithkdirrentstring {
    public int subarraysWithKDistinct(int[] nums, int k) {
        if(k==0){
            return 0;
        }
      return countAtmost(nums,k)-countAtmost(nums,k-1);  
    }
    public int countAtmost(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count+=i-left+1;
        }
        return count;
    }
}
