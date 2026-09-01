class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return odd(nums,k)-odd(nums,k-1);
    }
    int odd(int[] nums,int k) {
        int l=0,ans=0;
        for(int r=0;r<nums.length;r++) {
            if(nums[r]%2!=0) k--;
            while(k<0) {
                if(nums[l]%2!=0) k++;
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
}