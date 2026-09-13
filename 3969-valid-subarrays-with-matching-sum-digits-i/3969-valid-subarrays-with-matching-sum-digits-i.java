class Solution {
    public int countValidSubarrays(int[] nums,int x) {
        int n=nums.length,ans=0;
        for(int i=0;i<n;i++) {
            long s=0;
            for(int j=i;j<n;j++) {
                s+=nums[j];
                if(s%10==x&&String.valueOf(s).charAt(0)-'0'==x) {
                    ans++;
                }
            }
        }
        return ans;
    }
}