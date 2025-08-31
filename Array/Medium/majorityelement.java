package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class majorityelement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        majorityelement me=new majorityelement();
        int[] nums={3,2,3};
        System.out.println(me.majorityElement(nums));
    }
}
