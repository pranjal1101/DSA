class Solution {
    int[][] dp;

    public int minPathSum(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return dfs(grid,0,0);
    }

    int dfs(int[][] grid,int i,int j) {
        int m=grid.length,n=grid[0].length;

        if(i>=m||j>=n)
            return Integer.MAX_VALUE;

        if(i==m-1&&j==n-1)
            return grid[i][j];

        if(dp[i][j]!=-1)
            return dp[i][j];

        int down=dfs(grid,i+1,j);
        int right=dfs(grid,i,j+1);

        return dp[i][j]=grid[i][j]+Math.min(down,right);
    }
}