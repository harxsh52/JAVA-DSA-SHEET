package Array.Hard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class _sum {
        public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total=nums[i]+nums[k]+nums[j];
                if(total==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] & j<k){
                        j++;
                    }
                }else if(total<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        _sum obj=new _sum();
        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(arr));
    }
}
