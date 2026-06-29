class Solution {
    public boolean isHappy(int n){
        int slow=n,fast=s(n);
        while(fast!=1 && slow!=fast){
            slow=s(slow);
            fast=s(s(fast));
        }
        return fast==1;
    }
    int s(int n){
        int m=0;
        while(n>0){
            m+=(n%10)*(n%10);
            n/=10;
        }
        return m;
    }
}
