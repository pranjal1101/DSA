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
    List<Integer> ans = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> x=inorderTraversal(root);
        int[] arr=new int[x.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=x.get(i);
        }
        return build(arr,0,arr.length-1);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }
    void inorder(TreeNode node) {
        if (node==null) {
            return;
        }
        inorder(node.left);
        ans.add(node.val);
        inorder(node.right);
    }
    private TreeNode build(int[] nums,int l,int r){
        if(l>r) return null;
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums,l,mid-1);
        root.right=build(nums,mid+1,r);
        return root;
    }
}

