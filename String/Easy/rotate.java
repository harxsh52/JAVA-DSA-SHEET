package String.Medium;

public class rotate {
    public boolean rotateString(String s, String goal) {
       String s2=s.concat(s);
       return s2.contains(goal);
    }
}
