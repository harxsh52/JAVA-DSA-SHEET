package Greedy.Medium;

public class jump2 {
    public int jump(int[] nums) {
        int current=0;int farthest=0;
        int jump=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(nums[i]+i,farthest);
            if(i==current){
                jump++;
                current=farthest;
            }
        }
        return jump;
    }
}
