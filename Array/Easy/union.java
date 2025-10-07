import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class union {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
        }
        for(int i:set){
            list.add(i);
        }
        return list;
    }
}
