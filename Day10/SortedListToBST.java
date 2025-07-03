// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class SortedListToBST {
    // make a helper function to find the middle node of the given Linked List 
    public ListNode middleNode(ListNode head){
        if(head == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = slow;

        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // before return the mid of the Linked List we break the connection between mid and mid.prev 
        pre.next = null;

        return slow;

    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) { // if head is null then return null because there is no element in the linked list 
            return null;
        }else if(head.next == null){ // if one element is present the linked list then we make root node with the head value of linked list
            TreeNode root = new TreeNode(head.val);
            return root;
        }

        // make a mid use helper function
        ListNode mid = middleNode(head);
        // make a root TreeNode with the value of mid.val
        TreeNode root = new TreeNode(mid.val);

        // for the left child of the root make a recursive call with the head as next head for left sub tree
        root.left = sortedListToBST(head);
        // for the right child of the root node make a recursive call the mid.next as next head for the right sub tree
        root.right = sortedListToBST(mid.next);

        // finally return the root node
        return root;
    }
}
