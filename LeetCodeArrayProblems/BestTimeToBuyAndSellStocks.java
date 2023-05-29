public class BestTimeToBuyAndSellStocks {
    //java

    class Solution {
        public int maxProfit(int[] prices) {
            int minValue = Integer.MAX_VALUE; //In the given code, the line int minValue = Integer.MAX_VALUE;
            // initializes a variable named minValue with the maximum possible value that can be represented by the int data type in Java.
            int maxProfit = 0;

            for(int i = 0 ;i< prices.length; i++){

                if(prices[i] < minValue){
                    minValue = prices[i];
                }else if(prices[i] - minValue > maxProfit){
                    maxProfit = prices[i] - minValue;
                }
            }
            return maxProfit;


        }
    }

    //python



}
