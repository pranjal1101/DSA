class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int key:map.keySet()){
            int val=map.get(key);
            map.put(key,0);
            if(map.containsValue(val)){
                return false;
            }
            map.put(key,val);
        }
        return true;
    }
}