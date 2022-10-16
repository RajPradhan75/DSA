package datastructures.src.com.scaler.advanced.trees;

public class InorderAndPostOrder {

	public static void main(String[] args) {
		int[] A = { 2, 1, 3 };
		int[] B = { 2, 3, 1 };
		System.out.println(solve(A, B));
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}

	private static TreeNode solve(int[] A, int[] B) {
		return null;

	}

}
