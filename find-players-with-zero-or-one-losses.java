class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> winner=new HashMap<>();
        HashMap<Integer,Integer> loser=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            winner.put(matches[i][0],winner.getOrDefault(matches[i][0],0)+1);
            loser.put(matches[i][1],loser.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> zero=new ArrayList<>();
        List<Integer> one=new ArrayList<>();
        for(int w:winner.keySet()){
            if(!loser.containsKey(w)){
                zero.add(w);
            }
        }
        for(int l:loser.keySet()){
            if(loser.get(l)==1){
                one.add(l);
            }
        }
        Collections.sort(zero);
        Collections.sort(one);
        ans.add(zero);
        ans.add(one);
        return ans;
    }
}