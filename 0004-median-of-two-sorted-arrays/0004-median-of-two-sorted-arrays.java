class Solution {
    public double findMedianSortedArrays(int[] a,int[] b) {
        int[] c=new int[a.length+b.length];
        int i=0,j=0;
        for(int k=0;k<c.length;k++){
            if(i==a.length)
                c[k]=b[j++];
            else if(j==b.length)
                c[k]=a[i++];
            else if(a[i]<b[j])
                c[k]=a[i++];
            else
                c[k]=b[j++];
        }
        int n=c.length;
        if(n%2==0)
            return (c[n/2]+c[n/2-1])/2.0;
        return c[n/2];
    }
}