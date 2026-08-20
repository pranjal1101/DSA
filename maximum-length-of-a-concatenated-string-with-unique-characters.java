class Solution {
    public int maxLength(List<String> arr) {
        List<String> list=new ArrayList<>();
        list.add("");
        int ans=0;
        for(String s:arr) {
            if(!unique(s))
                continue;
            int n=list.size();
            for(int i=0;i<n;i++) {
                String x=list.get(i)+s;

                if(unique(x)) {
                    list.add(x);
                    ans=Math.max(ans,x.length());
                }
            }
        }
        return ans;
    }
    boolean unique(String s) {
        for(int i=0;i<s.length();i++)
            for(int j=i+1;j<s.length();j++)
                if(s.charAt(i)==s.charAt(j))
                    return false;

        return true;
    }
}