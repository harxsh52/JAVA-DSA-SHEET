package String.Medium;

public class anagram {
    public boolean isAnagram(String s, String t) {
        int[] v=new int[256];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            v[s.charAt(i)]++;
            v[t.charAt(i)]--;
        }
        for(int i:v){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
