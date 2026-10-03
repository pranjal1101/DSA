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
    List<Integer> ans=new ArrayList<>();
    int prev=Integer.MIN_VALUE;
    int count=0,max=0;
    public int[] findMode(TreeNode root) {
        solve(root);
        int[] a=new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            a[i]=ans.get(i);
        }
        return a;
    }
    public void solve(TreeNode root) {
        if(root==null) {
            return;
        }
        solve(root.left);
        if(root.val==prev) {
            count++;
        } else {
            count=1;
        }
        if(count>max) {
            ans.clear();
            ans.add(root.val);
            max=count;
        } else if(count==max) {
            ans.add(root.val);
        }
        prev=root.val;
        solve(root.right);
    }
}