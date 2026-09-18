/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray a) {
        int n=a.length();
        int l=0,r=n-1;
        while(l<r) {
            int m=l+(r-l)/2;
            if(a.get(m)<a.get(m+1)) {
                l=m+1;
            } else {
                r=m;
            }
        }
        int peak=l;
        l=0;
        r=peak;
        while(l<=r) {
            int m=l+(r-l)/2;
            int x=a.get(m);
            if(x==target) {
                return m;
            }
            if(x<target) {
                l=m+1;
            } else {
                r=m-1;
            }
        }
        l=peak+1;
        r=n-1;
        while(l<=r) {
            int m=l+(r-l)/2;
            int x=a.get(m);
            if(x==target) {
                return m;
            }
            if(x>target) {
                l=m+1;
            } else {
                r=m-1;
            }
        }
        return -1;
    }
}