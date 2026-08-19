class Solution {
    public int kConcatenationMaxSum(int[] arr,int k) {
        long sum=0,ans=0,cur=0;
        for(int x:arr){
            cur=Math.max(0,cur+x);
            ans=Math.max(ans,cur);
            sum+=x;
        }
        if(k>1){
            for(int x:arr){
                cur=Math.max(0,cur+x);
                ans=Math.max(ans,cur);
            }
        }
        if(k>2&&sum>0) ans+=sum*(k-2);
        return (int)(ans%1000000007);
    }
}