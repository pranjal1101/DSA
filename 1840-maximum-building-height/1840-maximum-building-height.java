class Solution{
    public int maxBuilding(int n,int[][] r){
        Arrays.sort(r,(a,b)->a[0]-b[0]);
        int m=r.length;
        int[][] a=new int[m+1][2];
        a[0]=new int[]{1,0};
        for(int i=0;i<m;i++){
            a[i+1]=r[i];
        }
        for(int i=1;i<=m;i++){
            a[i][1]=Math.min(a[i][1],a[i-1][1]+a[i][0]-a[i-1][0]);
        }
        for(int i=m-1;i>=0;i--){
            a[i][1]=Math.min(a[i][1],a[i+1][1]+a[i+1][0]-a[i][0]);
        }
        int ans=0;
        for(int i=0;i<m;i++){
            int d=a[i+1][0]-a[i][0];
            ans=Math.max(ans,(a[i][1]+a[i+1][1]+d)/2);
        }
        ans=Math.max(ans,a[m][1]+n-a[m][0]);
        return ans;
    }
}