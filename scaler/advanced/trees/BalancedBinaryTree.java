package datastructures.src.com.scaler.advanced.trees;

public class BalancedBinaryTree {

	TreeNode root;

	public BalancedBinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BalancedBinaryTree tree = new BalancedBinaryTree();
		tree.root = new TreeNode(3);
		tree.root.left = new TreeNode(9);
		tree.root.right = new TreeNode(20);
		tree.root.right.left = new TreeNode(15);
		tree.root.right.right = new TreeNode(7);
		System.out.println(isBalanced(tree.root));
	}

	public static boolean isBalanced(TreeNode root) {

		return height(root) != -1;
	}

	public static int height(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int lH = height(node.left);
		if (lH == -1) {
			return -1;
		}
		int rH = height(node.right);
		if (rH == -1) {
			return -1;
		}
		if (lH - rH < -1 || lH - rH > 1) {
			return -1;
		}
		return Math.max(lH, rH) + 1;
	}

}
