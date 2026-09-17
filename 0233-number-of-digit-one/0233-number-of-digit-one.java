class Solution {
    public int countDigitOne(int n) {
        long ans=0;
        for(long p=1;p<=n;p*=10) {
            long d=p*10;
            long q=n/d,r=n%d;
            ans+=q*p;
            if(r>=p) {
                ans+=Math.min(r-p+1,p);
            }
        }
        return (int)ans;
    }
}