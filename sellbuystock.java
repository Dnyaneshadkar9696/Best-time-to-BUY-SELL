//Best time to buy and dell stock
class sellbuystock{
    public static void main(String[] args) {
        int buy = buy();
        System.out.println(buy);

    }



    public static int buy(){
        int[] prices={7,1,5,3,6,4};
        int buyp = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyp){
                buyp = prices[i];
            }
            else{
                int currp = prices[i] - buyp;
                profit = Math.max(currp,profit);
            }
        }
        return profit;

    }
}