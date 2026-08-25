class Solution {
    public int clumsy(int n) {
        int ans=0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 6;
        ans=n*(n-1)/(n-2)+(n-3);
        n-=4;
        while(n>=4){
            ans-=n*(n-1)/(n-2);
            ans+=n-3;
            n-=4;
        }
        if(n==3)
            ans-=6;
        else if(n==2)
            ans-=2;
        else if(n==1)
            ans-=1;
        return ans;
    }
}