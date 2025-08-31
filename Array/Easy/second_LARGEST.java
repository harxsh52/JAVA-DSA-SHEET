public class second_LARGEST {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int maxx=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxx){
                max=maxx;
                maxx=arr[i];
            }
            else if(arr[i]<maxx & arr[i]>max ){
                max=arr[i];
            }
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        second_LARGEST obj=new second_LARGEST();
        System.out.println(obj.getSecondLargest(arr));
    }
}
