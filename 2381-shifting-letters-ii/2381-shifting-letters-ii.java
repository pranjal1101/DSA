class Solution {
    public String shiftingLetters(String s,int[][] shifts) {
        int n=s.length();
        int[] a=new int[n+1];
        for(int[] x:shifts) {
            int l=x[0],r=x[1],v=x[2]==1?1:-1;
            a[l]+=v;
            a[r+1]-=v;
        }
        StringBuilder sb=new StringBuilder();
        int x=0;
        for(int i=0;i<n;i++) {
            x+=a[i];
            int c=(s.charAt(i)-'a'+x)%26;
            if(c<0) {
                c+=26;
            }
            sb.append((char)('a'+c));
        }
        return sb.toString();
    }
}