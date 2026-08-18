class Solution {
    public int findKthNumber(int m,int n,int k){
        int l=1,r=m*n;
        while(l<r){
            int mid=l+(r-l)/2,c=0;
            for(int i=1;i<=m;i++) c+=Math.min(mid/i,n);
            if(c>=k) r=mid;
            else l=mid+1;
        }
        return l;
    }
}
