package Medium;

import java.util.ArrayList;
import java.util.List;

public class binary {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> list=new ArrayList<>();
        StringBuilder Sb=new StringBuilder();
        genrate(n,list,Sb,0);
        return list;
    }
    public static void genrate(int n,List<String> list,StringBuilder sb,int i){
        if(i==n){
            list.add(sb.toString());
            return;
        }
        genrate(n,list,sb.append('0'),i+1);
        sb.deleteCharAt(sb.length()-1);
        if(i==0  ||sb.charAt(sb.length()-1)=='0'){
            genrate(n,list,sb.append('1'),i+1);
            sb.deleteCharAt(sb.length()-1);
        }
       
        
    }
}
