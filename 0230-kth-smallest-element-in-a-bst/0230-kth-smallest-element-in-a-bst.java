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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l=new ArrayList<>();
        l=preorderTraversal(root);
        Collections.sort(l);
        int ans=l.get(k-1);
        return ans;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        find(root,l);
        return l;
    }
    void find(TreeNode root,List<Integer> l) {
        if(root==null) {
            return;
        }
        l.add(root.val);
        find(root.left,l);
        find(root.right,l);
    }
}