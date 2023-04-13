package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagOrderTraversal {
	TreeNode root;

	ZigZagOrderTraversal() {
		root = null;
	}

	public static void main(String[] args) {
		LevelOrderTraversal tree_level = new LevelOrderTraversal();
		tree_level.root = new TreeNode(3);
		tree_level.root.left = new TreeNode(9);
		tree_level.root.right = new TreeNode(20);
		tree_level.root.right.left = new TreeNode(15);
		tree_level.root.right.right = new TreeNode(7);
		System.out.println(zigzag(tree_level.root));
	}

	public static List<List<Integer>> zigzag(TreeNode root) {

		List<List<Integer>> res = new ArrayList<>();

		if (root == null)
			return res;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.offer(root);

		boolean reverse = false;

		while (!queue.isEmpty()) {

			int size = queue.size();

			List<Integer> level = new ArrayList<>();

			for (int i = 0; i < size; i++) {

				TreeNode node = queue.poll();

				if (reverse) {
					level.add(0, node.val);
				} else {
					level.add(node.val);
				}

				if (node.left != null) {
					queue.offer(node.left);
				}

				if (node.right != null) {
					queue.offer(node.right);
				}
			}
			res.add(level);
			reverse = !reverse;
		}
		return res;
	}
}
