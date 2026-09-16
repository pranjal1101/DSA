class Solution {
    public int numTilePossibilities(String tiles) {
        int[] a=new int[26];
        for(char c:tiles.toCharArray()) {
            a[c-'A']++;
        }
        return solve(a);
    }
    public int solve(int[] a) {
        int ans=0;
        for(int i=0;i<26;i++) {
            if(a[i]>0) {
                ans++;
                a[i]--;
                ans+=solve(a);
                a[i]++;
            }
        }
        return ans;
    }
}