package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KthSmallestElement {

	TreeNode root;

	public KthSmallestElement() {
		root = null;
	}

	public static void main(String[] args) {
		int k = 1;
		KthSmallestElement tree = new KthSmallestElement();
		tree.root = new TreeNode(5);
		tree.root.left = new TreeNode(3);
		tree.root.right = new TreeNode(6);
		tree.root.left.left = new TreeNode(2);
		tree.root.left.right = new TreeNode(4);
		tree.root.left.left.left = new TreeNode(1);
//		System.out.println(solve(tree.root, k));
		System.out.println(recursive(tree.root, k));
	}

	private static int solve(TreeNode root, int k) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode curr = root;
		int count = 0;

		while (!stack.isEmpty() || curr != null) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.left;
			} else {
				TreeNode node = stack.pop();
				if (++count == k)
					return node.val;
				curr = node.right;
			}
		}

		return Integer.MIN_VALUE;

	}

	private static int recursive(TreeNode root, int k) {

		List<Integer> list = new ArrayList<>();
		inorder(root, list);
		return list.get(k - 1);

	}

	private static void inorder(TreeNode root, List<Integer> list) {
		if (root == null)
			return;

		inorder(root.left, list);
		list.add(root.val);
		inorder(root.right, list);
	}

}
