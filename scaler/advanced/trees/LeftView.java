package datastructures.src.com.scaler.advanced.trees;

import java.util.ArrayList;

public class LeftView {

	TreeNode root;

	public LeftView() {

		root = null;
	}

	public static void main(String[] args) {
		LeftView tree = new LeftView();
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

	private static ArrayList<Integer> solve(TreeNode root) {

		ArrayList<Integer> level = new ArrayList<Integer>();
		leftView(root, level, 0);
		return level;
		
	}

	private static void leftView(TreeNode curr, ArrayList<Integer> level, int currentDepth) {
		
		if(curr == null) return;
		
		if(currentDepth == level.size() ) level.add(curr.val);
		
		leftView(curr.left, level, currentDepth + 1);
		leftView(curr.right, level, currentDepth + 1);
		
	}

}
