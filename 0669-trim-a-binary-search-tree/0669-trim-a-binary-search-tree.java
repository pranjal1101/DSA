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
    public TreeNode trimBST(TreeNode root,int low,int high){
        if(root==null) return null;
        if(root.val<low){
           return solve(root.right,null,low,high);
        }
        if(root.val>high){
            return solve(root.left,null,low,high);
        }
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        return root;
    }
    public TreeNode solve(TreeNode root,TreeNode parent,int low,int high){
        if(root==null) return null;
        if(root.val<low) return solve(root.right,parent,low,high);
        if(root.val>high) return solve(root.left,parent,low,high);
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        if(parent!=null){
            if(root.val<parent.val) parent.left=root;
            else parent.right=root;
        }
        return root;
    }
}