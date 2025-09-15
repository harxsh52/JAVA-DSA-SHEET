package DynamicProgramming.DPongrid;

import java.util.ArrayList;
import java.util.List;

public class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> result=new ArrayList<>();
        if(triangle.size()==1)return triangle.get(0).get(0);
        result.add(new ArrayList<>(triangle.get(0)));
        for(int i=1;i<triangle.size();i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<triangle.get(i).size();j++){
                if(j==0){
                    list.add(triangle.get(i).get(j)+result.get(i-1).get(j));
                }else if(j==triangle.get(i).size()-1){
                    list.add(triangle.get(i).get(j)+result.get(i-1).get(j-1));
                }else{
                    list.add(triangle.get(i).get(j)+Math.min(result.get(i-1).get(j),result.get(i-1).get(j-1)));
                }
            }
            result.add(new ArrayList<>(list));
        }
        int ans=Integer.MAX_VALUE;
        for(int i:result.get(result.size()-1)){
            ans=Math.min(ans,i);
        }
        return ans;
    }
}
