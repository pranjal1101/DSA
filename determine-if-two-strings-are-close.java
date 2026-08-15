class Solution {
    public boolean closeStrings(String a, String b) {
        if(a.length()!=b.length()) return false;

        int[] x=new int[26],y=new int[26];

        for(char c:a.toCharArray()) x[c-'a']++;
        for(char c:b.toCharArray()) y[c-'a']++;

        for(int i=0;i<26;i++)
            if((x[i]==0)!=(y[i]==0)) return false;

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x,y);
    }
}