package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalIterative {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		List<Integer> result = preorderTraversal(root);
		System.out.println(result); // Output: [4, 2, 1, 3, 6, 5, 7]
	}

	public static List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {

			TreeNode curr = stack.pop();

			if (curr != null) {
				result.add(curr.val);
				stack.push(curr.right);
				stack.push(curr.left);
			}
		}
		return result;
	}
}
