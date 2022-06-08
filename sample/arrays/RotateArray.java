package datastructures.src.com.sample.arrays;

public class RotateArray {

	public void leftRotateByOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[n - 1] = temp;
	}

	public void leftRotate(int arr[], int d, int n) {
		for (int i = 0; i < d; i++)
			leftRotateByOne(arr, n);
	}

	public void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		RotateArray rotateArray = new RotateArray();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 1;
		rotateArray.leftRotate(arr, d, arr.length);
		rotateArray.printArray(arr, arr.length);

	}

//	Time complexity : O(n * d) 
//	Auxiliary Space : O(1)

}
