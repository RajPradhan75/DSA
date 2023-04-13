package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* Example:
	 *
	 * Input:
	 *          1
	 *           \
	 *            2
	 *           / \
	 *          3   4
	 *
	 * Output: [3, 4, 2, 1]
*/

public class PostOrderTraversalIterative {
	public static void main(String[] args) {
		// Create a binary search tree
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(18);

		// Traverse the tree in post-order
		List<Integer> result = postorderTraversal(root);

		// Print the traversal result
		for (int i : result) {
			System.out.print(i + " ");
		}

		// 3 7 5 12 18 15 10
	}

	public static List<Integer> postorderTraversal(TreeNode root) {

		LinkedList<Integer> result = new LinkedList<>();
		Deque<TreeNode> stack = new ArrayDeque<>();
		TreeNode current = root;

		while (current != null || !stack.isEmpty()) {

			while (current != null) {
				stack.push(current);
				result.addFirst(current.val); // Add to front of list
				current = current.right;
			}
			// Once there are no more right children, traverse left subtree
			current = stack.pop();
			current = current.left;
		}
		return result;

	}

}
