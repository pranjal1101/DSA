class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        backtrack(s,0,0,"",ans);
        return ans;
    }
    public void backtrack(String s,int i,int parts,String cur,List<String> ans) {
        if(parts==4) {
            if(i==s.length()) {
                ans.add(cur.substring(1));
            }
            return;
        }
        for(int j=i;j<s.length()&&j<i+3;j++) {
            String x=s.substring(i,j+1);
            if(x.length()>1&&x.charAt(0)=='0') {
                break;
            }
            if(Integer.parseInt(x)>255) {
                break;
            }
            backtrack(s,j+1,parts+1,cur+"."+x,ans);
        }
    }
}