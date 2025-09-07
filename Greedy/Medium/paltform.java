package Greedy.Medium;

import java.util.Arrays;

public class paltform {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1;
        int j=0;
        int result=1;
        int platform=1;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                i++;
                platform++;
            }else{
                platform--;
                j++;
            }
            result=Math.max(result,platform);
        }
        return result;
    }
}
