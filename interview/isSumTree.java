package datastructures.src.com.interview;


public class isSumTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(26);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(3);

        if (isSumTree(root)) {
            System.out.println("The given tree is a SumTree.");
        } else {
            System.out.println("The given tree is not a SumTree.");
        }

    }

    private static boolean isSumTree(TreeNode root) {
        if (root == null || (root.left == null) && (root.right == null)) {
            return true;
        }

        int leftSubTree = sumTreeUtil(root.left);
        int rightSubTree = sumTreeUtil(root.right);

        if (root.val == leftSubTree + rightSubTree) {

            return isSumTree(root.left) && isSumTree(root.right);
        }
        return false;
    }


    private static int sumTreeUtil(TreeNode root) {
        if (root == null)
            return 0;

        return root.val + sumTreeUtil(root.left) + sumTreeUtil(root.right);
    }


//    class TreeNode<T> {
//        T val;
//        TreeNode<T> left;
//        TreeNode<T> right;
//
//        TreeNode(T val) {
//            this.val = val;
//            left = null;
//            right = null;
//        }
//    }

//    public class Solution {
//        public static boolean isSumTree(TreeNode<Integer> root) {
//            if (root == null || (root.left == null && root.right == null)) {
//                // If the node is null or a leaf node, it is a SumTree
//                return true;
//            }
//
//            // Recursively calculate the sum of the left and right subtrees
//            int leftSum = sumTreeUtil(root.left);
//            int rightSum = sumTreeUtil(root.right);
//
//            // Check if the current node's value is equal to the sum of its children
//            if (root.val == leftSum + rightSum) {
//                // Recursively check if the left and right subtrees are also SumTrees
//                return isSumTree(root.left) && isSumTree(root.right);
//            }
//
//            return false;
//        }
//
//        // Helper function to calculate the sum of a tree (used in isSumTree)
//        static int sumTreeUtil(TreeNode<Integer> node) {
//            if (node == null) {
//                return 0;
//            }
//            return node.val + sumTreeUtil(node.left) + sumTreeUtil(node.right);
//        }
//
//        public static void main(String[] args) {
//            // Test the function with the given example
//            TreeNode<Integer> root = new TreeNode<>(26);
//            root.left = new TreeNode<>(10);
//            root.right = new TreeNode<>(3);
//            root.left.left = new TreeNode<>(4);
//            root.left.right = new TreeNode<>(6);
//            root.right.right = new TreeNode<>(3);
//
//            if (isSumTree(root)) {
//                System.out.println("The given tree is a SumTree.");
//            } else {
//                System.out.println("The given tree is not a SumTree.");
//            }
//        }
//    }

}

