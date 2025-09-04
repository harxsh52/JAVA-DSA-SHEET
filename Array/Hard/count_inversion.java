package Array.Hard;
import java.util.ArrayList;

class count_inversion {
    static int inversionCount(int arr[]) {
        // Code Here
        return mergesort(arr,0,arr.length-1);
    }
static int mergesort(int[] arr, int low, int high) {
    int cnt = 0;
    if (low < high) {
        int mid = low + (high - low) / 2;
        // The corrected recursive call
        cnt += mergesort(arr, low, mid); 
        cnt += mergesort(arr, mid + 1, high);
        cnt += merge(arr, low, mid, high);
    }
    return cnt;
}
    static int merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        int cnt=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                cnt+=mid-left+1;
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt;
    }
}