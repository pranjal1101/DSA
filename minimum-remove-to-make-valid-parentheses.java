class Solution{
    public String minRemoveToMakeValid(String s){
        StringBuilder a=new StringBuilder();
        int count=0;

        for(char c:s.toCharArray()){
            if(c=='(')count++;
            if(c==')'){
                if(count==0)continue;
                count--;
            }
            a.append(c);
        }

        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='('&&count>0){
                count--;
                continue;
            }
            b.append(a.charAt(i));
        }

        return b.reverse().toString();
    }
}