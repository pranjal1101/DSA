class Solution{
    public int secondHighest(String s){
        int max=-1,second=-1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int n=c-'0';
                if(n>max){
                    second=max;
                    max=n;
                }else if(n<max&&n>second){
                    second=n;
                }
            }
        }
        return second;
    }
}