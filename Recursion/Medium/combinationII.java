package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        genrate(list,candidates,target,new ArrayList<>(),0,0);
        return list;
    }
    public void genrate(List<List<Integer>> list,int[] num,int target,List<Integer> l,int sum,int i){
        if(target==sum){
                list.add(new ArrayList<>(l));
                return;
            }
        if(i==num.length || target<sum){
            return;
        }
        l.add(num[i]);
        genrate(list,num,target,l,sum+num[i],i+1);
        l.remove(l.size()-1);
        while(i+1<num.length && num[i]==num[i+1]){
            i++;
        }
        genrate(list,num,target,l,sum,i+1);

    }
}
