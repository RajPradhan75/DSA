package datastructures.src.com.scaler.advanced.trees;

import java.util.HashSet;

public class TwoSumBST {

	TreeNode root;

	public TwoSumBST() {
		root = null;
	}

	public static void main(String[] args) {
		int B = 9;
		TwoSumBST tree = new TwoSumBST();
		tree.root = new TreeNode(5);
		tree.root.left = new TreeNode(3);
		tree.root.right = new TreeNode(6);
		tree.root.left.left = new TreeNode(2);
		tree.root.left.right = new TreeNode(4);
		tree.root.right.right = new TreeNode(7);
		System.out.println(twoSum(tree.root, B));
	}

	public static int twoSum(TreeNode root, int B) {
		HashSet<Integer> set = new HashSet<Integer>();
		int ans = dfs(root, set, B) ? 1 : 0;
		return ans;
	}

	public static boolean dfs(TreeNode root, HashSet<Integer> set, int k) {

		if (root == null)
			return false;

		if (set.contains(k - root.val))
			return true;

		set.add(root.val);

		return dfs(root.left, set, k) || dfs(root.right, set, k);

	}

}
