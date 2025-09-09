package SlidingWindow.Medium;

import java.util.HashMap;

public class numofsubstring {
    public int numberOfSubstrings(String s) {
        return countAtmost(s,3)-countAtmost(s,2);
    }
    public int countAtmost(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}
