package Greedy.Easy;

class minimum {
    public int findMin(int n) {
        // code here
        int[] coins={10,5,2,1};
        int total=0;
        for(int i=0;i<coins.length;i++){
            if(n>=coins[i]){
                while(n>=coins[i]){
                    n-=coins[i];
                    total++;
                }
            }
        }
        return total;
    }
}