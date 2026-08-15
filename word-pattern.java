class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a=s.split(" ");
        if(a.length!=pattern.length()) return false;

        HashMap<Character,String> map=new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);

            if(map.containsKey(c) && !map.get(c).equals(a[i]))
                return false;

            if(!map.containsKey(c) && map.containsValue(a[i]))
                return false;

            map.put(c,a[i]);
        }

        return true;
    }
}