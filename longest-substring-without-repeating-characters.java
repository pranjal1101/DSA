class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int l=0,ans=0;

        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i)))
                l=Math.max(l,m.get(s.charAt(i))+1);
            m.put(s.charAt(i),i);
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}