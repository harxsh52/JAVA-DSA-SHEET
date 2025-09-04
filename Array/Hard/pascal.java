package Array.Hard;

import java.util.ArrayList;
import java.util.List;

public class pascal {
        public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        result.add(list);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=result.get(i-1);
            list=new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(prev.get(j-1)+prev.get(j));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
    public static void main(String[] args) {
        pascal p=new pascal();
        System.out.println(p.generate(5));
    }
}
