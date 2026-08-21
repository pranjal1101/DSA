class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char c:text.toCharArray()) {
            if(c=='b') b++;
            if(c=='a') a++;
            if(c=='l') l++;
            if(c=='o') o++;
            if(c=='n') n++;
        }
        return Math.min(b,Math.min(a,Math.min(l/2,Math.min(o/2,n))));
    }
}