package hard;

import java.util.ArrayList;
import java.util.List;

public class palindrome {
        public boolean isPalindrome(String s,int left,int end){
        while(left<end){
            if(s.charAt(left)!=s.charAt(end)){
                return false;
            }
            left++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        genrate(0,s,new ArrayList<>(),list);
        return list;
    }
    public void genrate(int start,String s,List<String> l,List<List<String>> list){
        if(start==s.length()){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                l.add(s.substring(start,end+1));
                genrate(end+1,s,l,list);
                l.remove(l.size()-1);
            }
        }
    }
}
