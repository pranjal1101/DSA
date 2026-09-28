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
    TreeNode ans;
    int max=0;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        depth(root,0);
        return ans;
    }
    int depth(TreeNode root,int d) {
        if(root==null) {
            return d;
        }
        int l=depth(root.left,d+1);
        int r=depth(root.right,d+1);
        if(l==r&&l>=max) {
            max=l;
            ans=root;
        }
        return Math.max(l,r);
    }
}