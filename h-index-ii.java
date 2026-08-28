class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int s=0;
        int e=n-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            int papers=n-mid;
            if(citations[mid]>=papers) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return n-s;
    }
}