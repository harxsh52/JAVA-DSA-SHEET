package Bianrysearch.easy;

public class krotation {
    public int findKRotation(int arr[]) {
        // Code here
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}
