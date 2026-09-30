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
class Solution{
    TreeNode p=null,q=null,prev=null;
    public void recoverTree(TreeNode root){
        solve(root);
        int tmp=p.val;
        p.val=q.val;
        q.val=tmp;
    }
    private void solve(TreeNode root){
        if(root==null)return;
        solve(root.left);
        if(prev!=null&&root.val<prev.val){
            if(p==null)p=prev;
            q=root;
        }
        prev=root;
        solve(root.right);
    }
}
