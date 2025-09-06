package String.Medium;

public class roman {
    public int romanToInt(String s) {
        int total=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int curr=value(s.charAt(i));
            if(prev>curr){
                total-=curr;
            }else{
                total+=curr;
            }
            prev=curr;
        }
        return total;
    }
    public int value(Character a){
        switch(a){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default :return 0;
        }
    }
}
