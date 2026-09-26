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
    List<Integer>temp=new ArrayList<>();
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root,int targetSum){
        solve(root,targetSum,0);
        return ans;
    }
    void solve(TreeNode root,int target,int sum){
        if(root==null)return;
        sum+=root.val;
        temp.add(root.val);
        if(root.left==null&&root.right==null&&sum==target){
            ans.add(new ArrayList<>(temp));
        }
        solve(root.left,target,sum);
        solve(root.right,target,sum);
        temp.remove(temp.size()-1);
    }
}
