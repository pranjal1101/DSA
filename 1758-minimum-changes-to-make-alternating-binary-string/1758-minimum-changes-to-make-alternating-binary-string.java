class Solution {
    public int minOperations(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(i%2==0) {
                if(c=='1') {
                    a++;
                } else {
                    b++;
                }
            } else {
                if(c=='0') {
                    a++;
                } else {
                    b++;
                }
            }
        }
        return Math.min(a,b);
    }
}