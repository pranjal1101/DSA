class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int ans=events[0][0];
        int max=events[0][1];

        for(int i=1;i<events.length;i++){
            int time=events[i][1]-events[i-1][1];

            if(time>max){
                max=time;
                ans=events[i][0];
            }
            else if(time==max){
                ans=Math.min(ans,events[i][0]);
            }
        }

        return ans;
    }
}