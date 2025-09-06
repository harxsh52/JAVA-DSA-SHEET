package String.hard;

public class longestprefix {
    public String longestPrefix(String s) {
        int n=s.length();
        int[] lps=new int[s.length()];
        int len=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
            }else{
                if(len!=0){
                    len=lps[len-1];
                    i--;
                }else{
                    lps[i]=0;
                }
            }
        }
        int happy=lps[lps.length-1];
        return happy>0?s.substring(0,happy):"";
    }
}
