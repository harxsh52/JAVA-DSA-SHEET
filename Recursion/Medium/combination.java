package Medium;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        genrate(list,candidates,target,0,new ArrayList<>(),0);
        return list;
    }
    public void genrate(List<List<Integer>> list,int[] num,int target,int sum,List<Integer> l,int i){
        if(target<sum){
            return;
        }
        if(target==sum){
            list.add(new ArrayList<>(l));
            return;
        }
        if(i>=num.length){
            return;
        }
        l.add(num[i]);
        genrate(list,num,target,sum+num[i],l,i);
        l.remove(l.size()-1);
        genrate(list,num,target,sum,l,i+1);
    }
}
