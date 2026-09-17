class Solution {
    public int countSpecialIntegers(int[] nums) {
        int c=0;
        for(int z=0;z<nums.length;z++){
            int x=nums[z];
            boolean seen=false;
            for(int p=0;p<z;p++){
                if(nums[p]==x) seen=true;
            }
            if(seen) continue;
            int i=-1,j=-1,k=-1,t=0;
            for(int idx=0;idx<nums.length;idx++){
                if(nums[idx]==x){
                    if(t==0) i=idx;
                    else if(t==1) j=idx;
                    else k=idx;
                    t++;
                }
            }
            if(t==3&&j-i==k-j) c++;
        }
        return c;
    }
}