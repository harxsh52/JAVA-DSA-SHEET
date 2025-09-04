package Array.Hard;

import java.util.HashMap;

public class largest_subarray {
    static int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int max=0;
        int sum=0;
        map.put(0,-1);
        for(int i:arr){
            sum+=i;
            if(map.containsKey(sum)){
                max=Math.max(max,count-map.get(sum));
            }else{
                map.put(sum,count);
            }
            count++;
            
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,0};
        System.out.println(maxLength(arr));
    }
}
