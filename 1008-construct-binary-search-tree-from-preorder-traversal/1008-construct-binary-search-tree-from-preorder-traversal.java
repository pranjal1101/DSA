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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return solve(preorder,Integer.MAX_VALUE);
    }
    public TreeNode solve(int[] a,int max) {
        if(i==a.length||a[i]>max) {
            return null;
        }
        TreeNode root=new TreeNode(a[i++]);
        root.left=solve(a,root.val);
        root.right=solve(a,max);
        return root;
    }
}