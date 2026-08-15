class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t=0,c=0;
        for(int i:requests){
            t+=Math.abs(c-i);
            c=i;
        }
        return t;
    }
}