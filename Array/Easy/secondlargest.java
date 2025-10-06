public class secondlargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int sl=Integer.MIN_VALUE;
        int l=arr[0];
        for(int i=0;i<arr.length;i++){
            if(l<arr[i]){
                sl=l;
                l=arr[i];
            }else if(arr[i]>sl && arr[i]<l){
                sl=arr[i];
            }
        }
        return sl==Integer.MIN_VALUE?-1:sl;
    }
    public static void main(String[] args) {
        secondlargest obj = new secondlargest();
        int[] arr = {2, 3, 6, 6, 5};
        System.out.println("The second largest element is: " + obj.getSecondLargest(arr));
    }
}
