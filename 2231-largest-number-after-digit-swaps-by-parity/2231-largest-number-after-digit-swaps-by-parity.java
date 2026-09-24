class Solution {
    public int largestInteger(int num) {
        char[] a=(""+num).toCharArray();
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if((a[i]-'0')%2==(a[j]-'0')%2&&a[j]>a[i]) {
                    char x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
        return Integer.parseInt(new String(a));
    }
}