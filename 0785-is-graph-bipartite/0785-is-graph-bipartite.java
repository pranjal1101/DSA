class Solution {
    ArrayList<Integer>[] adj;
    HashSet<Integer> set1=new HashSet<>();
    HashSet<Integer> set2=new HashSet<>();
    boolean[] visited;
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        adj=new ArrayList[n];
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
            for(int v:graph[i])adj[i].add(v);
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(!dfs(i,true))return false;
            }
        }
        return true;
    }
    public boolean dfs(int u,boolean inSet1){
        visited[u]=true;
        if(inSet1){
            if(set2.contains(u))return false;
            set1.add(u);
        }else{
            if(set1.contains(u))return false;
            set2.add(u);
        }
        for(int v:adj[u]){
            if(!visited[v]){
                if(!dfs(v,!inSet1))return false;
            }else{
                if(inSet1&&set1.contains(v))return false;
                if(!inSet1&&set2.contains(v))return false;
            }
        }
        return true;
    }
}
