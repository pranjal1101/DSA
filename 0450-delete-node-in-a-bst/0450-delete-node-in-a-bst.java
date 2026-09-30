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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.left==null&&root.right==null) return null;
            if(root.left==null&&root.right!=null) return root.right;
            if(root.left!=null&&root.right==null) return root.left;
            TreeNode min=getRightMin(root.right);
            min.left=root.left;
            return root.right;
        }
        else if(key<root.val) root.left=deleteNode(root.left,key);
        else root.right=deleteNode(root.right,key);
        return root;
    }
    public TreeNode getRightMin(TreeNode root){
        if(root==null) return null;
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}