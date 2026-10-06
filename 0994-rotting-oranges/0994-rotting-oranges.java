class Solution{
    public int orangesRotting(int[][] g){
        int m=g.length,n=g[0].length,res=0;
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int size=q.size();

            while(size-->0){
                int[] p=q.poll();
                int i=p[0],j=p[1];

                if(i>0&&g[i-1][j]==1){
                    g[i-1][j]=2;
                    q.add(new int[]{i-1,j});
                }
                if(i<m-1&&g[i+1][j]==1){
                    g[i+1][j]=2;
                    q.add(new int[]{i+1,j});
                }
                if(j>0&&g[i][j-1]==1){
                    g[i][j-1]=2;
                    q.add(new int[]{i,j-1});
                }
                if(j<n-1&&g[i][j+1]==1){
                    g[i][j+1]=2;
                    q.add(new int[]{i,j+1});
                }
            }

            res++;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]==1){
                    return -1;
                }
            }
        }

        return res==0?0:res-1;
    }
}