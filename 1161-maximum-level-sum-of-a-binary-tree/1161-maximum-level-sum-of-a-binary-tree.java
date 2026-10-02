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
    int[] sum=new int[10000];
    int[] count=new int[10000];
    int max=Integer.MIN_VALUE;
    int ans=1;
    public int maxLevelSum(TreeNode root) {
        solve(root,1);
        for(int i=1;i<10000;i++) {
            if(count[i]>0&&sum[i]>max) {
                max=sum[i];
                ans=i;
            }
        }
        return ans;
    }
    public void solve(TreeNode root,int level) {
        if(root==null) {
            return;
        }
        sum[level]+=root.val;
        count[level]++;
        solve(root.left,level+1);
        solve(root.right,level+1);
    }
}