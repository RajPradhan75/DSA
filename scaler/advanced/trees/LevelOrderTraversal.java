package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	TreeNode root;

	LevelOrderTraversal() {
		root = null;
	}

	public static void main(String[] args) {
		LevelOrderTraversal tree_level = new LevelOrderTraversal();
		tree_level.root = new TreeNode(1);
		tree_level.root.left = new TreeNode(2);
		tree_level.root.right = new TreeNode(3);
		tree_level.root.left.left = new TreeNode(4);
		tree_level.root.left.right = new TreeNode(5);
		System.out.println(levelOrder(tree_level.root));
	}

	/*
	 * private static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
	 * 
	 * Queue<TreeNode> queue = new LinkedList<>();
	 * 
	 * queue.add(A); queue.add(null); // to recognize new level has started
	 * 
	 * ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	 * 
	 * ArrayList<Integer> level = new ArrayList<>();
	 * 
	 * while (queue.size() > 1) {
	 * 
	 * TreeNode curr_node = queue.poll();
	 * 
	 * if (curr_node != null) { level.add(curr_node.val);
	 * 
	 * if (curr_node.left != null) { queue.add(curr_node.left); }
	 * 
	 * if (curr_node.right != null) { queue.add(curr_node.right); } }
	 * 
	 * if (curr_node == null) { queue.add(null); list.add(level); level = new
	 * ArrayList<Integer>(); }
	 * 
	 * } list.add(level); return list; }
	 */

	private static List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			int cnt = queue.size();
			for (int i = 0; i < cnt; i++) {
				TreeNode node = queue.poll();
				level.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			res.add(level);
		}
		return res;
	}
}
