package SlidingWindow.Medium;

public class longestrepeatingcharater {
    public int characterReplacement(String s, int k) {
        int wstart=0;
        int res=0;
        int max=0;
        int[] num=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            num[ch-'A']++;
            max=Math.max(num[ch-'A'],max);
            while(i-wstart+1-max>k){
                num[s.charAt(wstart)-'A']--;
                wstart++;
            }
           
         res=Math.max(res,i-wstart+1);
        }
        return res;
    }
}
