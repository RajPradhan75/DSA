package datastructures.src.com.scaler.array.general;

public class SquareRoot {

	public static void main(String[] args) {
		int n = 1065024;

		System.out.println(findSquareRoot(n));
	}

	static int findSquareRoot(int n) {

		long start = 1, end = n/2, ans = 0;

		// Base cases
		if (n == 0 || n == 1) {
			return n;
		}
		
		while(start<=end) {
			long mid = (start+end)/2;
			
			if(mid*mid == n)
				return (int) mid;
			
			if(mid*mid<n) {
				start = mid + 1;
				ans = mid;
			} else
				end = mid -1;
		}

		return -1;
	}

}
