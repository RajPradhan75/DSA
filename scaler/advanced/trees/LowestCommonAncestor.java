package datastructures.src.com.scaler.advanced.trees;

public class LowestCommonAncestor {

	TreeNode root;

	public LowestCommonAncestor() {
		root = null;
	}

	public static void main(String[] args) {
		int B = 5, C = 1;
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new TreeNode(3);
		tree.root.left = new TreeNode(5);
		tree.root.left.left = new TreeNode(6);
		tree.root.left.right = new TreeNode(2);
		tree.root.left.right.left = new TreeNode(7);
		tree.root.left.right.right = new TreeNode(4);
		tree.root.right = new TreeNode(1);
		tree.root.right.left = new TreeNode(0);
		tree.root.right.right = new TreeNode(8);
		System.out.println(leastcommonancestor(tree.root, B, C));
	}

	public static int leastcommonancestor(TreeNode A, int B, int C) {

		TreeNode treeNode = lca(A, B, C);
//		if (!isTreeNodePresent(A, B) || !isTreeNodePresent(A, C))
//			return -1;
		return treeNode != null ? treeNode.val : -1;

	}

//	public static boolean isTreeNodePresent(TreeNode A, int key) {
//		if (A == null)
//			return false;
//		if (A.val == key)
//			return true;
//		boolean resOne = isTreeNodePresent(A.left, key);
//		if (resOne)
//			return true;
//		return isTreeNodePresent(A.right, key);
//	}

	private static TreeNode lca(TreeNode root, int B, int C) {

		// base case
		if (root == null || root.val == B || root.val == C)
			return root;

		TreeNode left = lca(root.left, B, C);
		TreeNode right = lca(root.right, B, C);

		// result
		if (left == null) {
			return right;
		} else if (right == null) {
			return left;
		} else {
			return root;
		}
	}

}
