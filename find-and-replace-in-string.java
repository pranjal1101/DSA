class Solution {
    public String findReplaceString(String s, int[] ind, String[] src, String[] tar) {
        StringBuilder a = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int x=-1;
            for(int j=0;j<ind.length;j++)
                if(ind[j]==i && s.startsWith(src[j],i)) x=j;
            if(x>=0){
                a.append(tar[x]);
                i+=src[x].length()-1;
            } else a.append(s.charAt(i));
        }
        return a.toString();
    }
}