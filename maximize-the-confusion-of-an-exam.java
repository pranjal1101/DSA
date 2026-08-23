class Solution{
    public int maxConsecutiveAnswers(String s,int k){
        return Math.max(find(s,k,'T'),find(s,k,'F'));
    }
    int find(String s,int k,char c){
        int l=0,count=0,ans=0;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)==c){
                count++;
            }
            while(count>k){
                if(s.charAt(l)==c){
                    count--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}