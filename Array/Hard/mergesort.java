package Array.Hard;

public class mergesort {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int q=m-1;
        int w=n-1;
        int e=n+m-1;
        while(w>=0){
            if(q>=0 && nums1[q]>nums2[w]){
                nums1[e]=nums1[q];
                q--;
            }else{
                nums1[e]=nums2[w];
                w--;
            }
            e--;
        }
        return;
    }
    public static void main(String[] args) {
        mergesort obj=new mergesort();
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        obj.merge(nums1, 3, nums2, 3);
        for(int i:nums1){
            System.out.print(i+" ");
        }
    }
}
