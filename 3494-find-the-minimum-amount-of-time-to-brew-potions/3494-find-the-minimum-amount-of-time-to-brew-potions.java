class Solution {
    public long minTime(int[] skill,int[] mana) {
        int n=skill.length;
        long[] f=new long[n];
        for(int x:mana) {
            long t=0;
            for(int i=0;i<n;i++) {
                t=Math.max(t,f[i])+1L*skill[i]*x;
            }
            f[n-1]=t;
            for(int i=n-2;i>=0;i--) {
                f[i]=f[i+1]-1L*skill[i+1]*x;
            }
        }
        return f[n-1];
    }
}