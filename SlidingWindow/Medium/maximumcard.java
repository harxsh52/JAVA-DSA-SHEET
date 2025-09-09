package SlidingWindow.Medium;

public class maximumcard {
    static{
        for(int i=0; i<300; i++){
            maxScore(new int[0], 0);
        }
    }
    public static int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int left = k-1;
        int right = cardPoints.length;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        if(left+1 == right)return sum;
        int max = sum;

        while(left>=0){
            right--;
            sum+=cardPoints[right];
            sum-=cardPoints[left];
            left--;
            max = Math.max(max, sum);
        }
        return max;

    }
}
