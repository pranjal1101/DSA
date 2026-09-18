class Solution {
    public int countDistinct(int[] nums,int k,int p) {
        Set<String> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++) {
            int c=0;
            String s="";
            for(int j=i;j<n;j++) {
                if(nums[j]%p==0) {
                    c++;
                }
                if(c>k) {
                    break;
                }
                s+=nums[j]+",";
                set.add(s);
            }
        }
        return set.size();
    }
}