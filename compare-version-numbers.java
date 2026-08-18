class Solution {
    public int compareVersion(String a,String b) {
        String[] x=a.split("\\."),y=b.split("\\.");
        int n=Math.max(x.length,y.length);

        for(int i=0;i<n;i++){
            int p=i<x.length?Integer.parseInt(x[i]):0;
            int q=i<y.length?Integer.parseInt(y[i]):0;
            if(p!=q) return p>q?1:-1;
        }
        return 0;
    }
}