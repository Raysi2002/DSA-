package Array_Data_Structure;

public class BuySellStocks_MyApproach {
    public static int buySellStock(int[] prices){
        int maxProfit = Integer.MIN_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                profit = prices[j] - prices[i];
            }

            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(buySellStock(arr));
    }
}
