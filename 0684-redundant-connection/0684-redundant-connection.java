class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] ans=new int[2];
        ArrayList<Integer>[] l=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            l[i]=new ArrayList<>();
        }
        for(int[] e:edges){
            Queue<Integer> q=new LinkedList<>();
            boolean[] visited=new boolean[n+1];
            q.add(e[0]);
            visited[e[0]]=true;
            while(!q.isEmpty()){
                int cur=q.poll();
                for(int v:l[cur]){
                    if(!visited[v]){
                        visited[v]=true;
                        q.add(v);
                    }
                }
            }
            if(visited[e[1]]){
                ans[0]=e[0];
                ans[1]=e[1];
                return ans;
            }
            l[e[0]].add(e[1]);
            l[e[1]].add(e[0]);
        }
        return ans;
    }
}