package datastructures.src.com.scaler.advanced.arrays1;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		System.out.println(solve(height));
	}

	public static int solve(int[] height) {

		int n = height.length;
		int left = 0;
		int right = n - 1;
		int maxLeft = 0, maxRight = 0;
		int units = 0;

		while (left <= right) {

			if (height[left] <= height[right]) {
				if (height[left] > maxLeft)
					maxLeft = height[left];
				else
					units += maxLeft - height[left];
				left++;
			} else {
				if (height[right] > maxRight)
					maxRight = height[right];
				else
					units += maxRight - height[right];
				right--;
			}
		}
		return units;
	}

}
