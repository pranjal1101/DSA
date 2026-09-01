class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            String r=new StringBuilder(s).reverse().toString();
            if(map.containsKey(r)){
                count++;
                map.remove(r);
            }
            else{
                map.put(s,0);
            }
        }
        return count;
    }
}