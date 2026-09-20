class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] a=(""+n).toCharArray();
        int i=a.length-1;
        while(i>0) {
            if(a[i]<a[i-1]) {
                a[i-1]--;
                a[i]='9';
            }
            i--;
        }
        for(i=1;i<a.length;i++) {
            if(a[i]<a[i-1]) {
                a[i]='9';
            }
        }
        return Integer.parseInt(new String(a));
    }
}