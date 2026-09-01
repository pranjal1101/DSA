class Solution {
    public int numberOfSubstrings(String s) {
        int len=s.length(),l=0,r=0,ans=0;
        int[] map=new int[3];
        while(r<len){
            map[s.charAt(r)-'a']++;
            while(map[0]>0&&map[1]>0&&map[2]>0){
                ans+=len-r;
                map[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return ans;
    }
}
