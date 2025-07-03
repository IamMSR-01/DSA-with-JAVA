public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
       return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // make a helper function for traversing in the tree and checking the root node should be greater then left child and smaller then right child by using lower and upper bound 
    public boolean helper(TreeNode root, Long min, Long max){
        if(root == null) return true;

        if(root.val <= min || root.val >= max) return false;

        boolean leftAns = helper(root.left, min, (long)root.val);
        boolean rightAns = helper(root.right, (long)root.val, max);

        return leftAns && rightAns;
    }
}
