package datastructures.src.com.neetcode.slidingwindow;

public class StockBuyAndSell {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		System.out.println(maxProfit(prices));

	}

	static int maxProfit(int[] prices) {

		int max = 0;

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min)
				min = prices[i];

			else if (prices[i] > min)
				max = Math.max(prices[i] - min, max);
		}
		return max;
	}

}
