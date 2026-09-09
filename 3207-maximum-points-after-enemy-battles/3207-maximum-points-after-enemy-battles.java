class Solution {
    public long maximumPoints(int[] e,int c) {
        Arrays.sort(e);
        if(c<e[0]) return 0;
        long ans=0;
        for(int i=e.length-1;i>=0;i--) {
            ans+=c/e[0];
            c%=e[0];
            c+=e[i];
        }
        return ans;
    }
}