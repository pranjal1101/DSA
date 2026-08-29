class Solution {
    public int minBishopMoves(int[] s, int[] t) {
        int r=Math.abs(s[0]-t[0]);
        int c=Math.abs(s[1]-t[1]);
        if(r==0&&c==0) return 0;
        if(r==c) return 1;
        if((s[0]+s[1])%2==(t[0]+t[1])%2) return 2;
        return -1;
    }
}