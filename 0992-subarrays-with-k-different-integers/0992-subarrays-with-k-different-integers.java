class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return count(arr,k)-count(arr,k-1);
    }
    public int count(int[] arr,int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0,res=0;
        while(j<arr.length){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(map.size()<k){
                res+=j-i+1;
                j++;
            }
            else{
                while(i<=j && map.size()>k){
                    map.put(arr[i],map.get(arr[i])-1);
                    if(map.get(arr[i])==0)
                        map.remove(arr[i]);
                    i++;
                }
                if(map.size()==k)
                    res+=j-i+1;
                j++;
            }
        }
        return res;
    }
}