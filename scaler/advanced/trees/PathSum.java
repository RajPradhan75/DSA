package datastructures.src.com.scaler.advanced.trees;

public class PathSum {
	TreeNode root;

	public PathSum() {
		root = null;
	}

	public static void main(String[] args) {
		int targetSum = 22;
		PathSum tree = new PathSum();
		tree.root = new TreeNode(5);
		tree.root.left = new TreeNode(4);
		tree.root.right = new TreeNode(8);
		tree.root.left.left = new TreeNode(11);
		tree.root.right.left = new TreeNode(13);
		tree.root.right.right = new TreeNode(4);
		tree.root.left.left.left = new TreeNode(7);
		tree.root.left.left.right = new TreeNode(2);
		tree.root.right.right.right = new TreeNode(1);
		System.out.println(solve(tree.root, targetSum));

	}

	private static boolean solve(TreeNode root, int targetSum) {

		if (root == null)
			return false;

		if (root.left == null && root.right == null && targetSum - root.val == 0)
			return true;
		else
			return solve(root.left, targetSum - root.val) || solve(root.right, targetSum - root.val);
	}
}
