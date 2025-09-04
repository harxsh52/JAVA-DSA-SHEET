package Array.Hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class miss_repeat {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        Set<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        int xor=0;
        for(int i:arr){
            xor^=i;
            if(set.contains(i)){
                list.add(i);
            }
            set.add(i);
        }
        for(int i=1;i<=arr.length;i++){
            xor^=i;
        }
        xor^=list.get(0);
        list.add(xor);
        return list;
    }
    public static void main(String[] args) {
        miss_repeat obj=new miss_repeat();
        int arr[]={3,1,3};
        System.out.println(obj.findTwoElement(arr));
    }
}
