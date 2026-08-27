class Solution {
    public String minWindow(String s,String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        for(char c:t.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int left=0,count=0,start=0,len=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            window.put(c,window.getOrDefault(c,0)+1);
            if(map.containsKey(c) && window.get(c)<=map.get(c)) {
                count++;
            }
            while(count==t.length()) {
                if(i-left+1<len) {
                    len=i-left+1;
                    start=left;
                }
                char ch=s.charAt(left);
                window.put(ch,window.get(ch)-1);
                if(map.containsKey(ch) && window.get(ch)<map.get(ch)) {
                    count--;
                }
                left++;
            }
        }
        if(len==Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start,start+len);
    }
}