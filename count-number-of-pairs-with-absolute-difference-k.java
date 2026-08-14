class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int n:nums){
            count+=map.getOrDefault(n+k,0);
            count+=map.getOrDefault(n-k,0);
            
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return count;
    }
}