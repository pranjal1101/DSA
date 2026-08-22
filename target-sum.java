class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums,int target){
        f(nums,0,0,target);
        return count;
    }
    void f(int[] nums,int i,int sum,int target){
        if(i==nums.length){
            if(sum==target) count++;
            return;
        }
        f(nums,i+1,sum+nums[i],target);
        f(nums,i+1,sum-nums[i],target);
    }
}
