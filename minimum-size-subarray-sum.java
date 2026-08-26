class Solution {
    public int minSubArrayLen(int target,int[] nums) {
        int n=nums.length,ans=n+1;
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=0;i<n;i++){
            int l=i+1,r=n;
            while(l<=r){
                int m=(l+r)/2;
                if(prefix[m]-prefix[i]>=target){
                    ans=Math.min(ans,m-i);
                    r=m-1;
                }else{
                    l=m+1;
                }
            }
        }

        return ans==n+1?0:ans;
    }
}