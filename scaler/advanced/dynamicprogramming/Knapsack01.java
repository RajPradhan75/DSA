package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class Knapsack01 {
	public static void main(String[] args) {
		int[] val = { 60, 100, 120 };
		int[] wt = { 10, 20, 30 };
		int w = 50;
		int n = val.length;

		// Taking items with weight
		// 20 and 30 will give us the maximum value i.e 100 + 120 = 220
		System.out.println(knapsack(val, wt, w, n));

	}

	public static int knapsack(int[] val, int[] wt, int w, int n) {

		if (n == 0 || w == 0)
			return 0;

		if (wt[n - 1] <= w) {
			return Math.max(val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1), 
					knapsack(val, wt, w, n - 1));

		} else if (wt[n - 1] > w)
			return knapsack(val, wt, w, n - 1);

		return 0;
	}
}
