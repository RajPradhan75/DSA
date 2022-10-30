package datastructures.src.com.scaler.advanced.trees;

public class DiameterOfBinaryTree {
	static int max = 0;
	TreeNode root;

	public DiameterOfBinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right = new TreeNode(3);
		System.out.println(solve(tree.root));

	}

	private static int solve(TreeNode root) {
		maxDepth(root);
		return max;
	}

	private static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		max = Math.max(max, left + right);
		return Math.max(left, right) + 1;
	}

}
