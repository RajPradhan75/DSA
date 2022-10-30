package datastructures.src.com.scaler.advanced.trees;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromPostAndInOrder {

	public static void main(String[] args) {
		int[] inOrder = { 9, 3, 15, 20, 7 };
		int[] postOrder = { 9, 15, 7, 20, 3 };
		System.out.println(buildTree(inOrder, postOrder));
	}

	private static TreeNode buildTree(int[] inOrder, int[] postOrder) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < inOrder.length; i++) {
			map.put(inOrder[i], i);
		}
		return createTree(inOrder, 0, inOrder.length - 1, postOrder, 0, postOrder.length - 1, map);
	}

	private static TreeNode createTree(int[] inOrder, int inLow, int inHigh, int[] postOrder, int postLow, int postHigh,
			Map<Integer, Integer> map) {

		if (inLow > inHigh || postLow > postHigh)
			return null;

		int val = postOrder[postHigh];
		TreeNode curr = new TreeNode(val);
		int pos = map.get(val);
		int len = inHigh - pos;

		curr.left = createTree(inOrder, inLow, pos - 1, postOrder, postLow, postHigh - len - 1, map);
		curr.right = createTree(inOrder, pos + 1, inHigh, postOrder, postHigh - len, postHigh - 1, map);
		return curr;
	}

}
