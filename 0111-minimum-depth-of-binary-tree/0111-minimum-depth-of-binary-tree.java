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
    public int minDepth(TreeNode root) {
        int ans=0;
        if(root==null) return 0;
        if(root.left==null){
            ans=1+minDepth(root.right);
        }
        else if(root.right==null){
            ans=1+minDepth(root.left);
        }
        else{
            int leftans=minDepth(root.left);
            int rightans=minDepth(root.right);
            int ans1=Math.min(leftans,rightans);
            ans=ans1+1;
        }
        return ans;
    
    }
}