import java.util.ArrayList;

class BalanceBST {
    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return BST(list, 0, list.size() - 1);
    }

    public TreeNode BST(ArrayList<Integer> list, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = BST(list, start, mid - 1);
        root.right = BST(list, mid + 1, end);

        return root;
    }
}