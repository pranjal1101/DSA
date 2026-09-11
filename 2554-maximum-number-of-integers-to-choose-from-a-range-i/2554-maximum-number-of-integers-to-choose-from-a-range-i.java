class Solution {
    public int maxCount(int[] banned,int n,int maxSum) {
        Set<Integer> ban=new HashSet<>();
        for(int x:banned) {
            ban.add(x);
        }
        int s=0,ans=0;
        for(int i=1;i<=n&&s+i<=maxSum;i++) {
            if(!ban.contains(i)) {
                s+=i;
                ans++;
            }
        }
        return ans;
    }
}