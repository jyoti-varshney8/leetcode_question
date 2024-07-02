// 101. Symmetric Tree
//   Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
// Example 1:

// Input: root = [1,2,2,3,4,4,3]
// Output: true
// Example 2:

// Input: root = [1,2,2,null,3,null,3]
// Output: false

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
    public boolean check(TreeNode root1,TreeNode root2){
        if(root1 == null && root2==null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val == root2.val){
            return check(root1.left,root2.right) && check(root1.right,root2.left);
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
       if(root == null){
        return true;
       }
       return check(root.left,root.right);
    }
}
