class Solution {
    public int minOperations(String s) {
        int n=s.length(),ans=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            int cnt=r;
            for(int i=0;i<n/2;i++){
                int a=s.charAt((i+r)%n)-'a';
                int b=s.charAt((n-1-i+r)%n)-'a';
                int d=Math.abs(a-b);
                cnt+=Math.min(d,26-d);
            }
            ans=Math.min(ans,cnt);
        }
        return ans;
    }
}