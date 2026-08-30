class Solution {
    public int findBestValue(int[] arr,int target) {
        int s=0,e=0;
        for(int x:arr) {
            if(x>e) e=x;
        }
        while(s<e) {
            int m=s+(e-s)/2,sum=0;
            for(int x:arr) sum+=Math.min(x,m);
            if(sum<target) s=m+1;
            else e=m;
        }
        int a=s,b=s-1,x=0,y=0;
        for(int z:arr) {
            x+=Math.min(z,a);
            y+=Math.min(z,b);
        }
        if(Math.abs(y-target)<=Math.abs(x-target)) return b;
        return a;
    }
}