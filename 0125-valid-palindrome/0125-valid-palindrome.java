class Solution{
    public boolean isPalindrome(String s){
        String a=s.toLowerCase(), b="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(Character.isLetterOrDigit(c)) b+=c;
        }
        for(int i=0,j=b.length()-1;i<j;i++,j--){
            if(b.charAt(i)!=b.charAt(j)) return false;
        }
        return true;
    }
}
