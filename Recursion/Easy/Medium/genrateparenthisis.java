package Medium;

import java.util.ArrayList;
import java.util.List;

public class genrateparenthisis {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        genrate(list,n,0,0,sb);
        return list;
    }
    public void genrate(List<String> list,int n,int i,int y,StringBuilder sb){
        if(2*n==i+y){
            list.add(sb.toString());
            return ;
        }
        if(i<n){
            sb.append('(');
            genrate(list,n,i+1,y,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(y<i){
            sb.append(')');
            genrate(list,n,i,y+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
