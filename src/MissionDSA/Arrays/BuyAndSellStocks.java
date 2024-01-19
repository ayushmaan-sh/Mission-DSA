package MissionDSA.Arrays;

public class BuyAndSellStocks {

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i]-buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,4,6,5};
        System.out.println(buyAndSellStocks(prices));
    }
}
