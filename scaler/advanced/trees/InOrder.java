package datastructures.src.com.scaler.advanced.trees;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
		// TODO Auto-generated constructor stub
	}

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class InOrder {

	TreeNode root;

	InOrder() {
		root = null;
	}

	// Wrappers over above recursive functions
	void printInorder() {
		printInorder(root);
	}

	void printInorder(TreeNode node) {
		if (node == null)
			return;

		printInorder(node.left);

		System.out.print(node.val + " ");

		printInorder(node.right);
	}

	public static void main(String[] args) {
		InOrder tree = new InOrder();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();
	}

}
