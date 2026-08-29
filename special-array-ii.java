class Solution {
    public boolean[] isArraySpecial(int[] nums,int[][] queries) {
        int n=nums.length;
        int[] pre=new int[n];
        for(int i=1;i<n;i++) {
            pre[i]=pre[i-1];
            if(nums[i]%2==nums[i-1]%2) pre[i]++;
        }
        boolean[] ans=new boolean[queries.length];
        for(int i=0;i<queries.length;i++) {
            int l=queries[i][0],r=queries[i][1];
            ans[i]=pre[r]==pre[l];
        }
        return ans;
    }
}