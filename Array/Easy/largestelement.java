class largestelement {
    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        for(int i:arr){
            if(i>=max){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(largest(arr));
    }
}