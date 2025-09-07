package Heap.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hand {
       public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0)return false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Arrays.sort(nums);
        for(int num:nums){
            if(map.get(num)>0){
                for(int i=num+1;i<num+k;i++){
                    if(map.getOrDefault(i,0)==0){
                        return false;
                    }
                    map.put(i,map.get(i)-1);
                }
                map.put(num,map.get(num)-1);
            }
        }
        return true;
    }
}
