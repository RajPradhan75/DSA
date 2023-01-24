package datastructures.src.com.scaler.advanced.trees;

public class RecoverBST {

	TreeNode root;

	public RecoverBST() {
		root = null;
	}

	static TreeNode firstElement = null;
	static TreeNode secondElement = null;
	// The reason for this initialization is to avoid null pointer exception in the
	// first comparison when prevElement has not been initialized
	static TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);

	public static void main(String[] args) {
		RecoverBST tree = new RecoverBST();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(2);
		System.out.println("Before: ");
		System.out.print(tree.root.val + " ");
		System.out.print(tree.root.left.val + " ");
		System.out.print(tree.root.left.right.val + " ");
		solve(tree.root);
		System.out.println();
		System.out.println("After: ");
		System.out.print(tree.root.val + " ");
		System.out.print(tree.root.left.val + " ");
		System.out.print(tree.root.left.right.val + " ");
	}

	public static void solve(TreeNode root) {
		// In order traversal to find the two elements
		traverse(root);

		// Swap the values of the two nodes
		int temp = firstElement.val;
		firstElement.val = secondElement.val;
		secondElement.val = temp;
	}

	private static void traverse(TreeNode root) {

		if (root == null)
			return;

		traverse(root.left);

		// Start of "do some business",
		// If first element has not been found, assign it to prevElement (refer to 6 in
		// the example above)
		if (firstElement == null && prevElement.val >= root.val) {
			firstElement = prevElement;
		}

		// If first element is found, assign the second element to the root (refer to 2
		// in the example above)
		if (firstElement != null && prevElement.val >= root.val) {
			secondElement = root;
		}
		prevElement = root;

		// End of "do some business"

		traverse(root.right);
	}

}
