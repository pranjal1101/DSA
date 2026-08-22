class Solution {
    public String decodeString(String s) {
        Stack<Integer> num=new Stack<>();
        Stack<String> str=new Stack<>();
        String curr="";
        int n=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                n=n*10+c-'0';
            }
            else if(c=='['){
                num.push(n);
                str.push(curr);
                n=0;
                curr="";
            }
            else if(c==']'){
                String temp=str.pop();
                int k=num.pop();
                while(k-->0) temp+=curr;
                curr=temp;
            }
            else{
                curr+=c;
            }
        }
        return curr;
    }
}