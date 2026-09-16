class Solution {
    public int countSymmetricIntegers(int low,int high) {
        int ans=0;
        for(int i=low;i<=high;i++) {
            String s=""+i;
            int n=s.length();
            if(n%2==1) {
                continue;
            }
            int x=0,y=0;
            for(int j=0;j<n/2;j++) {
                x+=s.charAt(j)-'0';
                y+=s.charAt(j+n/2)-'0';
            }
            if(x==y) {
                ans++;
            }
        }
        return ans;
    }
}