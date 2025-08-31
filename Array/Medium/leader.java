package Array.Medium;

import java.util.ArrayList;
import java.util.Stack;

public class leader {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==0)return list;
        Stack<Integer> s=new Stack<>();
        s.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(s.peek()<=arr[i]){
                s.push(arr[i]);
            }
        }

        while(!s.isEmpty()){
            list.add(s.pop());
        }
        return list;
    }
}
