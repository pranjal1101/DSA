class Solution{
    public String smallestSubsequence(String s){
        int[] count=new int[26];
        boolean[] used=new boolean[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            count[c-'a']--;
            if(used[c-'a']){
                continue;
            }
            while(!st.isEmpty()&&st.peek()>c&&count[st.peek()-'a']>0){
                used[st.pop()-'a']=false;
            }
            st.push(c);
            used[c-'a']=true;
        }
        StringBuilder ans=new StringBuilder();
        for(char c:st){
            ans.append(c);
        }
        return ans.toString();
    }
}