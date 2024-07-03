// Binary Tree Postorder Traversal

//   Given the root of a binary tree, return the postorder traversal of its nodes' values.


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return arr;
    }
    private void postorder(TreeNode node){
        if(node == null){
            return; 
        }

        postorder(node.left);
        postorder(node.right);
        arr.add(node.val);


    }
}
