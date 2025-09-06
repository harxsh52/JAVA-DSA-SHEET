package String.Medium;

public class beautystring {
    public int beautySum(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            int[] v=new int[26];
            for(int j=i;j<s.length();j++){
                v[s.charAt(j)-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int freq:v){
                    if(freq>0){
                    max=Math.max(freq,max);
                    min=Math.min(freq,min);
                    }
                }
                total+=max-min;
            }
        }
        return total;
    }
}
