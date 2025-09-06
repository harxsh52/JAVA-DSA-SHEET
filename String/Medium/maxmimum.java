package String.Medium;

public class maxmimum {
    public int maxDepth(String s) {
        int count=0;
        int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }else if(c==')'){
                count--;
            }
            depth=Math.max(depth,count);
        }
        return depth;
    }
}
