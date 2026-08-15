class Solution {
    public int arrayNesting(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
            ans=Math.max(ans,solve(nums,i));
        return ans;
    }

    int solve(int[] nums,int i){
        if(nums[i]==-1) return 0;
        int next=nums[i];
        nums[i]=-1;
        return 1+solve(nums,next);
    }
}