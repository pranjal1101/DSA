class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        if(n!=0){
            ans=Math.pow(x,n);
        }
        if(n==0) return 1;
        return ans;
    }
}