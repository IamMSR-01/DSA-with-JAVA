public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if the root is null the we return null
        if(root == null) return null;

        // now make TreeNode ans with the value root
        TreeNode ans = root;
        // make a loop for traverse in the tree while the ans is not null
        while(ans != null){
            // check the value of ans.val is greater then the value of p.val and as well as q.val the the ans node would be ans.left
            if(ans.val > p.val && ans.val > q.val){
                ans = ans.left;
            }else if(ans.val < p.val && ans.val < q.val){ // check the value of ans.val is smaller then the value of p.val and as well as q.val the the ans node would be ans.right
                ans = ans.right;
            }else{ // if both case is failled the we break the loop
                break;
            }
        }

        // and finally return the ans node
        return ans;
    }
}
