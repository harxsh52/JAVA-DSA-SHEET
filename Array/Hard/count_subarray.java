import java.util.HashMap;

class count_subarray {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i:arr){
            sum^=i;
            if(sum==k){
                count++;
            }
            count+=map.getOrDefault(sum^k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        count_subarray cs=new count_subarray();
        int arr[]={4,2,2,6,4};
        int k=6;
        System.out.println(cs.subarrayXor(arr,k));
    }
}