package datastructures.src.com.scaler.advanced.trees;

public class InvertBinaryTree {

	TreeNode root;

	public InvertBinaryTree() {
		root = null;
	}

	public static void main(String[] args) {

		InvertBinaryTree tree = new InvertBinaryTree();
		tree.root = new TreeNode(4);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(7);
		tree.root.left.left = new TreeNode(1);
		tree.root.left.right = new TreeNode(3);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(9);
		System.out.println(solve(tree.root));

	}

	private static TreeNode solve(TreeNode root) {

		if (root == null)
			return null;

		TreeNode tempRight = root.right;
		root.right = solve(root.left);
		root.left = solve(tempRight);
		return root;
	}

}
