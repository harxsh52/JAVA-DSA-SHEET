public class largest {
    public static int larges(int[] arr) {
        // code here
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
           if(max<arr[i]){
               max=arr[i];
           }
       }
       return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(larges(arr));
    }
}
