package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        genrate(list,0,nums.length,new ArrayList<>(),nums);
        return list;
    }
    public void genrate(List<List<Integer>> list,int i,int n,List<Integer> l,int[] nums){
        if(i==n){
            list.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        genrate(list,i+1,n,l,nums);
        l.remove(l.size()-1);
        while(i+1<n && nums[i]==nums[i+1]){
            i++;
        }
        genrate(list,i+1,n,l,nums);
    }
    
}
