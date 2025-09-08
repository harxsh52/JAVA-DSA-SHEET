package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class phoneletters {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        HashMap<Character,String> map=new HashMap<>();
        mapping(map);
        genrate(list,map,digits,new StringBuilder(),0);
        return list;
    }
    public void genrate(List<String> list,HashMap<Character,String> map,String digits,StringBuilder sb,int i){
        if(i>=digits.length()){
            if(!digits.isEmpty()){
                list.add(sb.toString());
            }
            return;
        }
        String s=map.get(digits.charAt(i));
        for(char ch:s.toCharArray()){
            sb.append(ch);
            genrate(list,map,digits,sb,i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public void mapping(HashMap<Character,String> map){
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }
}
