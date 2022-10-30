package datastructures.src.com.scaler.advanced.trees;

public class RangeSumOfBST {

	TreeNode root;

	public RangeSumOfBST() {
		root = null;
	}

	public static void main(String[] args) {
		RangeSumOfBST tree = new RangeSumOfBST();
		int low = 7, high = 15;
		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(15);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(7);
		tree.root.right.right = new TreeNode(18);
		
		System.out.println(solve(tree.root, low, high));
	}

	private static int solve(TreeNode root, int low, int high) {

		if (root == null)
			return 0;

		int left = solve(root.left, low, high);
		int right = solve(root.right, low, high);

		if (root.val > high)
			return left;
		if (root.val < low)
			return right;

		return root.val + left + right;
	}

}
