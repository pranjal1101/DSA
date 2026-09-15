class Solution {
    public long maximumSumOfHeights(int[] h) {
        int n=h.length;
        long ans=0;
        for(int i=0;i<n;i++) {
            long sum=h[i];
            int x=h[i];
            for(int j=i-1;j>=0;j--) {
                x=Math.min(x,h[j]);
                sum+=x;
            }
            x=h[i];
            for(int j=i+1;j<n;j++) {
                x=Math.min(x,h[j]);
                sum+=x;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}