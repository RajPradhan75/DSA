package datastructures.src.com.interview;

import com.sun.source.tree.Tree;

public class PathSum {

    public static void main(String[] args) {
        int target = 22;
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        System.out.println(findPathSum(root, target));
    }


    private static boolean findPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }

        return findPathSum(root.left, targetSum - root.val) ||
                findPathSum(root.right, targetSum - root.val);


    }







}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}




// Iterative
//public class PathSum {
//
//    public static void main(String[] args) {
//        int target = 22;
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(11);
//        root.left.left.left = new TreeNode(7);
//        root.left.left.right = new TreeNode(2);
//        root.right.left = new TreeNode(13);
//        root.right.right = new TreeNode(4);
//        root.right.right.right = new TreeNode(1);
//
//        System.out.println(findPathSum(root, target));
//    }
//
//    private static boolean findPathSum(TreeNode root, int targetSum) {
//        while (root != null) {
//            if (root.left == null) {
//                targetSum -= root.val;
//                if (targetSum == 0 && root.right == null) {
//                    return true;
//                }
//                root = root.right;
//            } else {
//                TreeNode predecessor = root.left;
//                while (predecessor.right != null && predecessor.right != root) {
//                    predecessor = predecessor.right;
//                }
//
//                if (predecessor.right == null) {
//                    predecessor.right = root;
//                    root = root.left;
//                } else {
//                    predecessor.right = null;
//                    targetSum -= root.val;
//                    if (targetSum == 0 && root.right == null) {
//                        return true;
//                    }
//                    root = root.right;
//                }
//            }
//        }
//        return false;
//    }
//}
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}







