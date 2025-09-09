package SlidingWindow.Medium;

import java.util.HashMap;

public class fruitbasket {
    public int totalFruit(int[] fruits) {
        return countAtmost(fruits,2);
    }
    public int countAtmost(int[] fruits,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>k){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
