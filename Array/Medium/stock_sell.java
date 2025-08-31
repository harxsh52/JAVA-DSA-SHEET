package Array.Medium;

public class stock_sell {
    public int maxProfit(int[] prices) {
        int max=0;
        int min_s=prices[0];
        for(int i=1;i<prices.length;i++){
            if(min_s>prices[i]){
                min_s=prices[i];
            }
            max=Math.max(max,prices[i]-min_s);
        }
        return max;
    }

    public static void main(String[] args) {
        stock_sell obj=new stock_sell();
        int[] prices={7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}
