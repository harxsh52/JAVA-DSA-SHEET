package String.Easy;

import java.util.HashMap;

public class Isomporphisim {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char S=s.charAt(i);
            char T=t.charAt(i);
            if(map1.containsKey(S)){
                if(map1.get(S)!=T){
                    return false;
                }
            }else{
                map1.put(S,T);
            }
            if(map2.containsKey(T)){
                if(map2.get(T)!=S){
                    return false;
                }
            }else{
                map2.put(T,S);
            }
        }
        return true;
    }
}
