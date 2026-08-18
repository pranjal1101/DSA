class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Set<List<Integer>> r=new HashSet<>();

        for(int i=0;i<a.length;i++){
            Map<Integer,Integer> m=new HashMap<>();
            for(int j=i+1;j<a.length;j++){
                int x=-a[i]-a[j];
                if(m.containsKey(x)){
                    List<Integer> t=Arrays.asList(a[i],a[j],x);
                    Collections.sort(t);
                    r.add(t);
                }
                m.put(a[j],j);
            }
        }
        return new ArrayList<>(r);
    }
}