class Solution {
    public int sumDecoded(long[] nums) {
        int mod=1000000007;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            long w=nums[i]%10;
            long d=nums[i]/10;
            long d_len=0;
            long k=w;
            while(k>=10)k/=10;
            long n=d;
            while(n>0){
                d_len++;
                n/=10;
            }
            long x=(long)(d/Math.pow(10,d_len-k));
            long y=(long)(d%Math.pow(10,d_len-k));

            long res=1;
            for(int j=0;j<y;j++) res=(res*x)%mod;

            sum=(sum+res)%mod;
        }
        return (int)sum;
    }
}
