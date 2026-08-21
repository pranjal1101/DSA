class Solution {
    public int countPairs(int[] deliciousness) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long ans=0;
        int max=0;

        for(int x:deliciousness){
            max=Math.max(max,x);
        }

        for(int x:deliciousness){
            for(int i=1;i<=2*max;i*=2){
                int y=i-x;
                ans+=map.getOrDefault(y,0);
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }

        return (int)(ans%1000000007);
    }
}