class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        int n = groupSizes.length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;++i)
        {
                if(!map.containsKey(groupSizes[i]))
                {
                        map.put(groupSizes[i],new ArrayList<>());
                        
                }
                List<Integer> cur=map.get(groupSizes[i]);
            cur.add(i);
            if(cur.size()==groupSizes[i]) {
                res.add(cur);
                map.remove(groupSizes[i]);
            }
        }
        return res;
 
        
    }
}