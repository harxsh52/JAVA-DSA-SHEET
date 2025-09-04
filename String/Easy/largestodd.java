package String.Easy;

public class largestodd {
    public String largestOddNumber(String num) {
        int i=-1;
        for(int j=num.length()-1;j>=0;j--){
            if((num.charAt(j)-'0')%2!=0){
                i=j;
                break;
            }
        }
        if(i==-1){
            return num.substring(0,0);
        }
        return num.substring(0,i+1);
    }
}
