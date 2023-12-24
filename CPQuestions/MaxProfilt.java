package CPQuestions;
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class MaxProfilt {
    public static int maxProfit(int[] prices) {
            int buyPrices=Integer.MAX_VALUE ;
            int maxProfit=0 ;
            for (int i=0;i<prices.length;i++) {
                if (buyPrices<prices[i]) {
                    int profit=prices[i]-buyPrices ;
                    maxProfit=Math.max(maxProfit, profit) ;
                }else {
                    buyPrices=prices[i] ;
                }
            }
            return maxProfit ;
    }
    public static void main (String[] args ) {
            int arr1[]={2,4,1};
            System.out.print(maxProfit(arr1));
    }
}
