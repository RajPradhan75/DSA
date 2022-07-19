package datastructures.src.com.scaler.trees;

import java.util.ArrayList;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
		// TODO Auto-generated constructor stub
	}

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class PreOrder {

	public static void main(String[] args) {

		TreeNode node = new TreeNode();
		PreOrder preorder = new PreOrder();
		node.val = 1;
		preorder.preorderTraversal(node);
		node.val = 6;
		preorder.preorderTraversal(node);
		node.val = 2;
		preorder.preorderTraversal(node);
		node.val = 3;
		System.out.println(	preorder.preorderTraversal(node));

	}
	ArrayList<Integer> preOrder = new ArrayList<>();

	public ArrayList<Integer> preorderTraversal(TreeNode A) {


		return preOrder(A, preOrder);
	}

	public ArrayList<Integer> preOrder(TreeNode A, ArrayList<Integer> preOrder) {
		if (A == null)
			return preOrder;
		preOrder.add(A.val);
		preOrder(A.left, preOrder);
		preOrder(A.right, preOrder);
		return preOrder;

	}

}
