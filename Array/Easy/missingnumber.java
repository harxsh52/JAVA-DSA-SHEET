public class missingnumber {
    public int missingNumber(int[] nums) {
        int mis=0;
        for(int i:nums){
            mis^=i;
        }
        for(int i=1;i<=nums.length;i++){
            mis^=i;
        }
        return mis;
    }
}
