class Solution {
    public int longestSubstring(String s,int k) {
        int ans=0;
        for(int unique=1;unique<=26;unique++) {
            HashMap<Character,Integer> map=new HashMap<>();
            int left=0,count=0,valid=0;
            for(int i=0;i<s.length();i++) {
                char c=s.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
                if(map.get(c)==1) {
                    count++;
                }
                if(map.get(c)==k) {
                    valid++;
                }
                while(count>unique) {
                    char ch=s.charAt(left);
                    if(map.get(ch)==k) {
                        valid--;
                    }
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0) {
                        count--;
                    }
                    left++;
                }
                if(count==unique && valid==unique) {
                    ans=Math.max(ans,i-left+1);
                }
            }
        }
        return ans;
    }
}