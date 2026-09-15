class Solution {
    public int[] vowelStrings(String[] words,int[][] queries) {
        int n=words.length;
        int[] p=new int[n+1];
        for(int i=0;i<n;i++) {
            p[i+1]=p[i];
            String s=words[i];
            char a=s.charAt(0),b=s.charAt(s.length()-1);
            if((a=='a'||a=='e'||a=='i'||a=='o'||a=='u')&&(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')) {
                p[i+1]++;
            }
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++) {
            ans[i]=p[queries[i][1]+1]-p[queries[i][0]];
        }
        return ans;
    }
}