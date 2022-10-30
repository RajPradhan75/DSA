package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {

	TreeNode root;

	public TopView() {
		root = null;
	}

	public static void main(String[] args) {
		TopView tree = new TopView();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.left.left = new TreeNode(8);
		tree.root.left.right = new TreeNode(5);
		tree.root.right = new TreeNode(3);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		System.out.println(solve(tree.root));
	}

	/*
	 * class Pair { TreeNode node; int hd;
	 * 
	 * public Pair(TreeNode node, int hd) {
	 * 
	 * this.node = node; this.hd = hd;
	 * 
	 * }
	 * 
	 * }
	 */

	public static ArrayList<Integer> solve(TreeNode A) {
		Queue<TreeNode> leftQueue = new LinkedList<TreeNode>();
		Queue<TreeNode> rightQueue = new LinkedList<TreeNode>();

		leftQueue.add(A.left);
		rightQueue.add(A.right);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(A.val);

		// first process all the leftNodes.
		while (!leftQueue.isEmpty()) {
			TreeNode node = leftQueue.poll();

			if (node == null)
				break;

			leftQueue.add(node.left);
			arr.add(node.val);
		}

		// then process all the right.
		while (!rightQueue.isEmpty()) {
			TreeNode node = rightQueue.poll();

			if (node == null)
				break;

			rightQueue.add(node.right);
			arr.add(node.val);
		}

		return arr;
	}
}