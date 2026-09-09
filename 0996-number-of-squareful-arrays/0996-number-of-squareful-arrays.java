class Solution {
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        return solve(nums,new boolean[nums.length],0,-1);
    }
    int solve(int[] a,boolean[] used,int n,int prev) {
        if(n==a.length) return 1;
        int ans=0;
        for(int i=0;i<a.length;i++) {
            if(used[i]) continue;
            if(i>0&&!used[i-1]&&a[i]==a[i-1]) continue;
            if(prev!=-1) {
                int x=(int)Math.sqrt(a[i]+a[prev]);
                if(x*x!=a[i]+a[prev]) continue;
            }
            used[i]=true;
            ans+=solve(a,used,n+1,i);
            used[i]=false;
        }
        return ans;
    }
}