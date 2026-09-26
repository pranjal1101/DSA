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
    public boolean isBalanced(TreeNode root) {
        return height(root)!=Integer.MIN_VALUE;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        if(l==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int r=height(root.right);
        if(r==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(Math.abs(l-r)>1) return Integer.MIN_VALUE;
        return Math.max(l,r)+1;
    }
}
