class Solution {
    public boolean checkArray(int[] nums, int k) {
        int n=nums.length,sum=0;
        int[] diff=new int[n+1];
        for(int i=0;i<n;i++) {
            sum+=diff[i];
            nums[i]+=sum;
            if(nums[i]<0) return false;
            if(nums[i]>0) {
                if(i+k>n) return false;
                sum-=nums[i];
                diff[i+k]+=nums[i];
            }
        }
        return true;
    }
}