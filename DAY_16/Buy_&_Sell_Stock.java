class Buy_&_Sell_Stock {
    public int maxProfit(int[] prices) {
            int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // Profit if sold today
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Buy at lower price
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    }
