class Solution{
    public int minimumPairRemoval(int[]a){
        int n=a.length,ans=0;
        while(!sorted(a,n)){
            int k=0,s=a[0]+a[1];
            for(int i=1;i<n-1;i++){
                int t=a[i]+a[i+1];
                if(t<s){s=t;k=i;}
            }
            a[k]=s;
            for(int i=k+1;i<n-1;i++)a[i]=a[i+1];
            n--;
            ans++;
        }
        return ans;
    }
    private boolean sorted(int[]a,int n){
        for(int i=1;i<n;i++)if(a[i]<a[i-1])return false;
        return true;
    }
}
