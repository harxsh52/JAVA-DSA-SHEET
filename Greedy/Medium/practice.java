package Greedy.Medium;
import java.util.HashSet;
public class practice {
    static int pageFaults(int N, int C, int pages[]) {
        // code here
        if(pages.length==0 || pages.length<C)return pages.length;
        
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i:pages){
            if(!set.contains(i)){
                count++;
            }else{
                set.remove(i);
            }
            set.add(i);
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
