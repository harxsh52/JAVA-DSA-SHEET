package String.Medium;

public class longest_substring {
        public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        String maxstr=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String odd=Expand(s,i,i);
            String even=Expand(s,i,i+1);
            if(odd.length()>maxstr.length()){
                maxstr=odd;
            }
            if(even.length()>maxstr.length()){
                maxstr=even;
            }
        }
        return maxstr;
    }
    public String Expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}
