package String.Medium;

public class atoi {
    public int myAtoi(String s) {
        s=s.trim();
        int sign=1;
        int i=0;
        if(s.charAt(i)=='+'){
            i++;
        }else if(s.charAt(i)=='-'){
            i++;
            sign=-1;
        }
        long result=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            result=result*10+(s.charAt(i)-'0');
            if(sign ==1 && result==Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign ==-1 && result==Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return(int)(sign* result);
    }
}
