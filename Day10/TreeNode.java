public class TreeNode {
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
// merge two binary tree 
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        } else if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        }
        // make a common tree node root with a value root1.val + root2.val;
        TreeNode root = new TreeNode(root1.val + root2.val);

        // make recursive call for left tree node
        root.left = mergeTrees(root1.left, root2.left);
        // make recursive call for right tree node
        root.right = mergeTrees(root1.right, root2.right);

        // return the final tree node root
        return root;
    }
}
