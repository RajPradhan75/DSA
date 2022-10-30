package datastructures.src.com.scaler.advanced.trees;

public class ValidateBST {
	TreeNode root;

	public ValidateBST() {
		root = null;
	}

	public static void main(String[] args) {
		ValidateBST tree = new ValidateBST();
		tree.root = new TreeNode(2);
		tree.root.left = new TreeNode(1);
		tree.root.right = new TreeNode(3);
		System.out.println((isValid(tree.root, Long.MIN_VALUE, Long.MAX_VALUE)));
	}

	private static boolean isValid(TreeNode root, long minVal, long maxVal) {

		if (root == null)
			return true;

		if (root.val >= maxVal || root.val <= minVal)
			return false;

		return isValid(root.left, minVal, root.val) && isValid(root.right, root.val, maxVal);

	}

}
