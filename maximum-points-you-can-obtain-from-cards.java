class Solution {
    public int maxScore(int[] cardPoints,int k){
        int n=cardPoints.length;
        int total=0;
        for(int i=0;i<n;i++) total+=cardPoints[i];
        if(k==n) return total;
        int s1=0; 
        for(int i=0;i<n-k;i++) s1+=cardPoints[i];
        int ans=s1;
        for(int i=n-k;i<n;i++){
            s1+=cardPoints[i]-cardPoints[i-(n-k)];
            ans=Math.min(ans,s1);
        }
        return total-ans;
    }
}
