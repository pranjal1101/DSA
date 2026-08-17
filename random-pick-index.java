class Solution {
    int[] nums;
    Random r=new Random();
    public Solution(int[] nums){
        this.nums=nums;
    }
    public int pick(int target){
        int ans=-1,c=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==target && r.nextInt(++c)==0) ans=i;
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */