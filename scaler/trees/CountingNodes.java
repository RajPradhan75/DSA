package datastructures.src.com.scaler.trees;

public class CountingNodes {
	
//	public static void main(String[] args) {
//		
//		TreeNode node = new TreeNode();
//		node.val = 4;
//		node.val = 5;
//		node.val = 2;
//		node.val = 3;
//		node.val = 6;
//		
//		
//		System.out.println(solve(node));
//	}
	

//	class TreeNode {
//		int val;
//		TreeNode left;
//		TreeNode right;
//
//		TreeNode(int x) {
//			val = x;
//			left = null;
//			right = null;
//		}
//	}

	static int count = 0;

	public static int solve(TreeNode A) {
		return countNodes(A, Integer.MIN_VALUE);
	}

	public static int countNodes(TreeNode A, int max) {
		if (A == null)
			return 0;

		if (A.val > max) {
			max = A.val;
			count++;
		}
		countNodes(A.left, max);
		countNodes(A.right, max);
		return count;

	}
}
