package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderIterative {

	TreeNode root;

	InOrderIterative() {
		root = null;
	}

	public static void main(String[] args) {
		InOrderIterative tree_level = new InOrderIterative();
		tree_level.root = new TreeNode(5);
		tree_level.root.left = new TreeNode(2);
		tree_level.root.left.left = new TreeNode(1);
		tree_level.root.left.right = new TreeNode(4);
		tree_level.root.right = new TreeNode(8);
		tree_level.root.right.left = new TreeNode(7);
		tree_level.root.right.right = new TreeNode(9);
		
		//         5
	    //       /   \
	    //      2     8
	    //     / \   / \
	    //    1   4 7   9
	    //
	    // The in-order traversal would be: [1, 2, 4, 5, 7, 8, 9]

		System.out.println(inOrder(tree_level.root));
	}

	public static List<Integer> inOrder(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;

		while (curr != null || !stack.isEmpty()) {

			while (curr != null) {
				stack.push(curr); // Push the current node onto the stack
				curr = curr.left; // Traverse to the left child
			}

			curr = stack.pop(); // Pop the top node off the stack
			result.add(curr.val); // Add the value of the node to the result list
			curr = curr.right; // Traverse to the right child
		}

		// If the right child is not null, traverse down to its leftmost node
		// and push each node onto the stack as we go
		return result;
	}

}
