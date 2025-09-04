package String.Easy;

public class reverse {
    public String reverseWords(String s) {
        String[] e=s.trim().split("\\s++");
        StringBuilder sb=new StringBuilder();
        for(int i=e.length-1;i>=0;i--){
            sb.append(e[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
