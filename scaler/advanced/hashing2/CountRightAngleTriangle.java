package datastructures.src.com.scaler.advanced.hashing2;

import java.util.HashMap;

public class CountRightAngleTriangle {

	public static void main(String[] args) {
		int[] A = { 1, 1, 2, 3, 3 };
		int[] B = { 1, 2, 1, 2, 1 };
		System.out.println(solve(A, B));
	}

	private static int solve(int[] A, int[] B) {
		int n = A.length;
		HashMap<Integer, Integer> xpoints = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> ypoints = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
	         xpoints.put(A[i], xpoints.getOrDefault(A[i],0) + 1);


             ypoints.put(B[i], ypoints.getOrDefault(B[i],0) + 1);
		}

// Store the total count of triangle
		int count = 0;

// Iterate to check for total number
// of possible triangle
		for (int i = 0; i < n; i++) {
			if (xpoints.get(A[i]) >= 1 && ypoints.get(B[i]) >= 1) {

				// Add the count of triangles
				// formed
				count += (xpoints.get(A[i]) - 1) * (ypoints.get(B[i]) - 1);
			}
		}

// Total possible triangle
		return count;
	}

}
