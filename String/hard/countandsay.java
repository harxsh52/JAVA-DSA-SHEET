public class countandsay {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return compute(countAndSay(n-1));
    }
    public String compute(String s){
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
            int j=i;
            while(j<s.length() && s.charAt(i)==s.charAt(j))j++;
            sb.append(j-i);
            sb.append(s.charAt(i));
            i=j;
        }
        return sb.toString();
    }
}
