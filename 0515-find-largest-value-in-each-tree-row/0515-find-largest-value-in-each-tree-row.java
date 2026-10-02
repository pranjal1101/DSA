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
    public List<Integer> largestValues(TreeNode root) {
        solve(root,0);
        return ans;
    }
    public void solve(TreeNode root,int level) {
        if(root==null) {
            return;
        }
        if(level==ans.size()) {
            ans.add(root.val);
        } else {
            ans.set(level,Math.max(ans.get(level),root.val));
        }
        solve(root.left,level+1);
        solve(root.right,level+1);
    }
}