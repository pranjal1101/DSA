class Solution {
    public int longestPalindrome(String s,String t) {
        int ans=1;
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                String a=s.substring(i,j+1);
                if(pal(a)) ans=Math.max(ans,a.length());
                for(int x=0;x<t.length();x++) {
                    for(int y=x;y<t.length();y++) {
                        String b=t.substring(x,y+1);
                        String c=a+b;
                        if(pal(c)) ans=Math.max(ans,c.length());
                    }
                }
            }
        }
        for(int i=0;i<t.length();i++) {
            for(int j=i;j<t.length();j++) {
                String a=t.substring(i,j+1);
                if(pal(a)) ans=Math.max(ans,a.length());
            }
        }
        return ans;
    }

    boolean pal(String s) {
        int i=0,j=s.length()-1;
        while(i<j) {
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
}