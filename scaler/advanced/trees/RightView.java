package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayList;
import java.util.List;

public class RightView {

	TreeNode root;

	public RightView() {
		root = null;
	}

	public static void main(String[] args) {

		RightView tree = new RightView();
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

	private static ArrayList<Integer> solve(TreeNode A) {
		ArrayList<Integer> level = new ArrayList<>();
		rightView(A, level, 0);
		return level;
	}

	private static void rightView(TreeNode curr, List<Integer> result, int currDepth) {

		if (curr == null)
			return;

		if (currDepth == result.size())
			result.add(curr.val);

		rightView(curr.right, result, currDepth + 1);
		rightView(curr.left, result, currDepth + 1);

	}

}
