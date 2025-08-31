public class linear_search {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        linear_search obj=new linear_search();
        int[] arr={2,3,4,5,6};
        int x=5;
        int result=obj.search(arr, x);
        System.out.println(result);
    }
}
