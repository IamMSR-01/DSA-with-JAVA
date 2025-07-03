public class InsertIntoBST {
     public TreeNode insertIntoBST(TreeNode root, int val) {
        // if root is equal to null the make new ans root with the value val and return it 
        if(root == null){
            TreeNode ans = new TreeNode(val);
            return ans;
        }

        // if the given val is smaller than the root value then the given val is added in left of root node by making recursive call 
        if(root.val > val){
            root.left = insertIntoBST(root.left, val);
        }else{ // if the given val is greater than the root value then the given val is added in right of root node by making recursive call 
            root.right = insertIntoBST(root.right, val);
        }

        // finally return the root node
        return root;
    }
}
