class Solution {
    public int countSubIslands(int[][] grid1,int[][] grid2) {
        int ans=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1){
                    if(dfs(grid1,grid2,i,j)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    boolean dfs(int[][] a,int[][] b,int i,int j){
        if(i<0||j<0||i>=b.length||j>=b[0].length||b[i][j]==0){
            return true;
        }
        b[i][j]=0;
        boolean x=dfs(a,b,i+1,j);
        boolean y=dfs(a,b,i-1,j);
        boolean z=dfs(a,b,i,j+1);
        boolean w=dfs(a,b,i,j-1);
        return a[i][j]==1&&x&&y&&z&&w;
    }
}