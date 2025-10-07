public class singlenumber {
    public int singleNumber(int[] nums) {
        int mis=0;
        for(int i:nums){
            mis^=i;
        }
        return mis;
    }
}
