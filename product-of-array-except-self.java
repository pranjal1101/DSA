class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int count=0;
        int prod=1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0) prod*=nums[i];
            if(nums[i]==0) count++;
        } 
        if(count==0){
            for(int i=0;i<n;i++){
                ans[i]= prod/nums[i];
            }
        }
        else if(count==1){
            for(int i=0;i<n;i++){
                if(nums[i]==0) ans[i]= prod;
                else ans[i]=0;
                
            }
        }
        else{
            for(int i=0;i<n;i++){
                ans[i]= 0;
            }
        }
        return ans;
    }
}