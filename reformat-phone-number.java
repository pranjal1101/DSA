class Solution {
    public String reformatNumber(String number) {
        String s=number.replace(" ","").replace("-","");
        String ans="";
        while(s.length()>4){
            ans+=s.substring(0,3)+"-";
            s=s.substring(3);
        }
        if(s.length()==4)
            ans+=s.substring(0,2)+"-"+s.substring(2);
        else
            ans+=s;
        return ans;
    }
}