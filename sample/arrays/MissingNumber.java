package datastructures.src.com.sample.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,6};
		int n = arr.length;

		int missing_no = findMissingNumXOR(arr, n);

		System.out.println("Missing number is " + missing_no);

	}

	
	static int findMissingNumFormula(int[] arr, int n) {
		// all numbers from 0 to n - sum of n-1 elements in array
			int sum = n;
		 for (int i = 0; i < n; i++)   //0,1,2,3,4,6
		        sum += i - arr[i];
		 return sum;
		
	}

	// Using XOR  (Best approach as it will not give overflow error)
	static int findMissingNumXOR(int[] arr, int n) {
	
		    int xor = 0, i = 0;
			for (i = 0; i < n; i++) {
				xor = xor ^ i ^ arr[i]; // a^b^b = a
			}
			
			return xor ^ i;

	}

}