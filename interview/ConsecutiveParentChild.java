package datastructures.src.com.interview;

public class ConsecutiveParentChild {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        int result = countConsecutiveParentChildPairs(root);
        System.out.println("Output : " + result); // Output: 2
    }

    private static int countConsecutiveParentChildPairs(TreeNode root) {

       return countConsecutivePairs(root, null, 0);
    }

    private static int countConsecutivePairs(TreeNode node, TreeNode parent, int count){

        if(node == null){
            return count;
        }

//        if(parent != null && Math.abs(parent.val - node.val) == 1)
//            count++;
        if(parent != null && Math.abs(parent.val - node.val) == 1)
            count++;

        count = countConsecutivePairs(node.left, node, count);
        count = countConsecutivePairs(node.right, node, count);

        return count;
    }
}
