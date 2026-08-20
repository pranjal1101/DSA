class Solution {
    public int minSubarray(int[] a, int p) {
        int r=0;
        for(int x:a) {
            r=(r+x)%p;
        }
        if(r==0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int cur=0;
        int ans=a.length;
        for(int i=0;i<a.length;i++){
            cur=(cur+a[i])%p;
            int x=(cur-r+p)%p;
            if(map.containsKey(x)){
                ans=Math.min(ans,i-map.get(x));
            }
            map.put(cur,i);
        }
        if(ans==a.length){
            return -1;
        }
        return ans;
    }
}