package Medium;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        genrate(nums.length,0,new ArrayList<>(),list,nums);
        return list;
    }
    public static void genrate(int n,int i,List<Integer> r,List<List<Integer>> list,int[] nums){
        if(n==i){
            list.add(new ArrayList<>(r));
            return;
        }
        genrate(n,i+1,r,list,nums);
        r.add(nums[i]);
        genrate(n,i+1,r,list,nums);
        r.remove(r.size()-1);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
}
