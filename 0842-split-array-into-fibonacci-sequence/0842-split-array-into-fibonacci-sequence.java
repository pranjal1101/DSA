class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> ans=new ArrayList<>();
        solve(num,0,ans);
        return ans;
    }
    boolean solve(String s,int index,List<Integer> ans) {
        if(index==s.length()) return ans.size()>=3;
        long num=0;
        for(int i=index;i<s.length();i++) {
            if(i>index&&s.charAt(index)=='0') break;
            num=num*10+(s.charAt(i)-'0');
            if(num>Integer.MAX_VALUE) break;
            if(ans.size()>=2) {
                long sum=(long)ans.get(ans.size()-1)+ans.get(ans.size()-2);
                if(num<sum) continue;
                if(num>sum) break;
            }
            ans.add((int)num);
            if(solve(s,i+1,ans)) return true;
            ans.remove(ans.size()-1);
        }
        return false;
    }
}