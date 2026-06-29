class Solution {
    public int oddCells(int m,int n,int[][] ind){
        int[] r=new int[m],c=new int[n];
        for(int[] x:ind){
            r[x[0]]++;
            c[x[1]]++;
        }
        int ans=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                ans+=(r[i]+c[j])%2;
        return ans;
    }
}
